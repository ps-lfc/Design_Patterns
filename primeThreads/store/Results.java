
package primeThreads.store;

import java.util.ArrayList;

import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class Results implements StdoutDisplayInterface,stdIN {
    // appropriate data structure as private data member
	private ArrayList<Integer> arraylist =null;
	/*
	 * This is a constructor
	 */
	public Results(){
		
		Logger.writeMessage("Constructor called for Results class",DebugLevel.CONSTRUCTOR);
	arraylist = new ArrayList<Integer>();
	}
    // appropriate method to save prime number to the data structure
	/**
	 * Calculates the sum of prime numbers in data structure and prints it
	 */
	public void writeSumToScreen() {
		// ..
		int sum=0;
	 for(int i=0;i<arraylist.size();i++)
	 {	
		sum=sum + arraylist.get(i);
		 
	 }
	 Logger.writeMessage("The sum of all the prime numbers is: "+sum, DebugLevel.OUTPUT_MESSAGE);
	 Logger.writeMessage("Content of data structure is: "+toString(), DebugLevel.PRINT_CONTENT);
	 
	}
	/**
	 * Adds the prime numbers to the array list
	 * @param fileContent Prime number after testing
	 */
	public synchronized void addNumber(int fileContent) {
		// TODO Auto-generated method stub
		 Logger.writeMessage("Entry added in data structure is: "+fileContent, DebugLevel.PRINT_DATASTRUCTURE);
		 arraylist.add(fileContent);
		
	}
	/**
	 * Prints the arraylist if debug level is 1
	 */
	@Override
	public String toString() {
		return "Results [arraylist=" + arraylist + "]";
	}
	
	
} 
