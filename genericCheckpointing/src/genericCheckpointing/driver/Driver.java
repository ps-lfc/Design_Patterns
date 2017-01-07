package genericCheckpointing.driver;

import java.util.Random;
import java.util.Vector;

import genericCheckpointing.server.RestoreI;
import genericCheckpointing.server.StoreI;
import genericCheckpointing.server.StoreRestoreI;
import genericCheckpointing.util.FileProcessor;
import genericCheckpointing.util.File_Interface;
import genericCheckpointing.util.MyAllTypesFirst;
import genericCheckpointing.util.MyAllTypesSecond;
import genericCheckpointing.util.ProxyCreator;
import genericCheckpointing.util.RandomGenerator;
import genericCheckpointing.util.SerializableObject;
import genericCheckpointing.xmlStoreRestore.StoreRestoreHandler;


public class Driver {

	
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Usage Improper: Please provide the arguments as per the assignemnt requirement");
			System.exit(1);
		}
		String mode = args[0];
		int NUM_OF_OBJECTS = 0;
		String outputFile = args[2];
		Vector<SerializableObject> objects_old = new Vector<SerializableObject>();
		Vector<SerializableObject> objects_new = new Vector<SerializableObject>();
		
		ProxyCreator pc = new ProxyCreator();
		try {
			NUM_OF_OBJECTS = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.err.println("Number Format exception for NUM_OF_OBJECTS");
			System.exit(1);
		}
		File_Interface file_Interface = new FileProcessor(outputFile);
		StoreRestoreI cpointRef = (StoreRestoreI) pc.createProxy(new Class[] { StoreI.class, RestoreI.class },
				new StoreRestoreHandler(file_Interface));
		StoreRestoreHandler storeRestoreHandler = new StoreRestoreHandler(file_Interface);
		MyAllTypesFirst myFirst;
		MyAllTypesSecond mySecond;
		if (mode.equals("serdeser")) {
			file_Interface.openFileForWrinting();
			for (int i = 0; i < NUM_OF_OBJECTS; i++) {
				if ((i & 1) == 0) {
					myFirst = new MyAllTypesFirst(RandomGenerator.randInt(0, 99999), Long.valueOf(RandomGenerator.randInt(0, 999999)), String.valueOf(RandomGenerator.generateString(6)), true);
				} else {
					myFirst = new MyAllTypesFirst(RandomGenerator.randInt(0, 99999), Long.valueOf(RandomGenerator.randInt(0, 999999)), String.valueOf(RandomGenerator.generateString(6)), false);
				}
				mySecond = new MyAllTypesSecond(Double.valueOf(RandomGenerator.randInt(0, 99999)), Float.valueOf(RandomGenerator.randInt(0, 99999)), (short) RandomGenerator.randInt(0, 32565),String.valueOf(RandomGenerator.generateString(1)).charAt(0));
				objects_old.addElement(myFirst);
				objects_old.addElement(mySecond);
				((StoreI) cpointRef).writeObj(myFirst, "XML");
				((StoreI) cpointRef).writeObj(mySecond, "XML");
			}
			SerializableObject myRecordRet;
			file_Interface.closeFile();
			file_Interface.openFile();
			for (int j = 0; j < 2 * NUM_OF_OBJECTS; j++) {
				myRecordRet = ((RestoreI) cpointRef).readObj("XML");
				objects_new.add(myRecordRet);
			}
			int changedCount = 0;
			for (int i = 0; i < objects_new.size(); i++) {
				changedCount++;
			}
			if (changedCount == objects_new.size()) {
				System.out.println("0 mismatched objects");
			}
		} else if(mode.equals("deser")) {
			
			SerializableObject myRecordRet;
			objects_new = new Vector<SerializableObject>();
			file_Interface.openFile();
			for(int j = 0; j < NUM_OF_OBJECTS; j++) {
				myRecordRet = ((RestoreI) cpointRef).readObj("XML");
				objects_new.add(myRecordRet);
			}
			for (int i = 0; i < objects_new.size(); i++) {
				System.out.println(objects_new.get(i));
			}
		}
	}
}