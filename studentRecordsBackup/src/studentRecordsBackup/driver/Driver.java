package studentRecordsBackup.driver;

import studentRecordsBackup.util.BSTBuilder;
import studentRecordsBackup.util.File_Interface;

public class Driver {
	public static void main(String[] args) {
		
		if(args.length != 2) {
		System.err.println("Usage Improper: Please provide the arguments as per the assignemnt requirement");
		System.exit(1);
	}
	  try {
		int updateValue=Integer.parseInt(args[1]);
	    } catch (NumberFormatException e) {
	    	System.err.println("Usage Improper: Please provide the arguments as per the assignemnt requirement");
	    	System.err.println("Argument " + args[1] + " must be an integer.");
	        System.exit(1);
	    }
	  
	  
	  
	File_Interface fileProcessor = new BSTBuilder(args[0]);
	fileProcessor.readLineFromFile();
	int updateValue=Integer.parseInt(args[1]);
	fileProcessor.printTree(updateValue);
	
	}

}
