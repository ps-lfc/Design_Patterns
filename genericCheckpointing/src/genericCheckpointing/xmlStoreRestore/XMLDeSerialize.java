package genericCheckpointing.xmlStoreRestore;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import genericCheckpointing.util.File_Interface;
import genericCheckpointing.util.SerializableObject;

public class XMLDeSerialize implements DeSerializationStrategy {
	
	private DeSerializableTypes deSerializationInterface;
	public XMLDeSerialize() {
		this.deSerializationInterface = new DeSerializableTypes();
	}
	@Override
	public Object deSerializeObject(File_Interface file_Interface) {
		String line = new String();
		line = file_Interface.readLineFromFile();
		Class cls;
		Object object = null;
		while ((line = file_Interface.readLineFromFile()) != null ) {
			Class[] paramBoolean = new Class[1];
			paramBoolean[0] = Boolean.TYPE;
			Class[] paramString = new Class[1];
			paramString[0] = String.class;
			Class[] paramInt = new Class[1];
			paramInt[0] = Integer.TYPE;
			Class[] paramDouble = new Class[1];
			paramDouble[0] = Double.TYPE;
			Class[] paramLong = new Class[1];
			paramLong[0] = Long.TYPE;
			Class[] paramFloat = new Class[1];
			paramFloat[0] = Float.TYPE;
			Class[] paramShort = new Class[1];
			paramShort[0] = Short.TYPE;
			Class[] paramChar = new Class[1];
			paramChar[0] = Character.TYPE;
			String className =  deSerializationInterface.returnClassname(line);
			try {
				cls = Class.forName(className);
				object = cls.newInstance();
				Field fields[] = cls.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					if (fields[i].getType().getSimpleName().equals("int")) {
						int myInt = deSerializationInterface.extractTagsForInt(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramInt);
						setIntegerFirst.invoke(object, myInt);
					} else if(fields[i].getType().getSimpleName().equals("long")) {
						long myInt = deSerializationInterface.extractTagsForLong(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramLong);
						setIntegerFirst.invoke(object, myInt);
					} else if(fields[i].getType().getSimpleName().equals("String")) {
						String myInt = deSerializationInterface.extractTagsForString(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramString);
						setIntegerFirst.invoke(object, myInt);
					} else if(fields[i].getType().getSimpleName().equals("boolean")) {
						boolean myInt = deSerializationInterface.extractTagsForBoolean(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramBoolean);
						setIntegerFirst.invoke(object, myInt);
					}else if (fields[i].getType().getSimpleName().equals("double")) {
						double myInt = deSerializationInterface.extractTagsForDouble(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramDouble);
						setIntegerFirst.invoke(object, myInt);
					} else if(fields[i].getType().getSimpleName().equals("float")) {
						float myInt = deSerializationInterface.extractTagsForFloat(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramFloat);
						setIntegerFirst.invoke(object, myInt);
					} else if(fields[i].getType().getSimpleName().equals("short")) {	
						short myInt = deSerializationInterface.extractTagsForShort(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramShort);
						setIntegerFirst.invoke(object, myInt);
					} else if(fields[i].getType().getSimpleName().equals("char")) {
						char myInt = deSerializationInterface.extractTagsForChar(file_Interface.readLineFromFile());
						Method setIntegerFirst = cls.getDeclaredMethod("set"+fields[i].getName(), paramChar);
						setIntegerFirst.invoke(object, myInt);	
					}
				}
				file_Interface.readLineFromFile();
				file_Interface.readLineFromFile();
				return object;
			} catch (ClassNotFoundException e) {
				System.err.println("Class Not found exception");
				System.exit(0);
			} catch (InstantiationException e) {
				System.err.println("Instantiation Exception");
				System.exit(0);
			} catch (IllegalAccessException e) {
				System.err.println("Illegal Access Exception");
				System.exit(0);
			} catch (IllegalArgumentException e) {
				System.err.println("Illegal Argument Exception");
				System.exit(0);
			}  catch (SecurityException e) {
				System.err.println("Security exception");
				System.exit(0);
			} catch (NoSuchMethodException e) {
				System.err.println("No Such method Exception");
				System.exit(0);
			} catch (InvocationTargetException e) {
				System.err.println("Invocation Target Exception");
				System.exit(0);
			}
		}
		return null;
	}
}
