
package primeThreads.threadMgmt;

import primeThreads.store.Results;
import primeThreads.store.stdIN;
import primeThreads.util.File_Interface;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class WorkerThread implements Runnable  {
		
	File_Interface  fileProcessor= null;
	stdIN results=null;
	IsPrime isPrime=null;
	boolean bool;
	/*
	 * This is a parameterized constructor
	 */
    public WorkerThread(File_Interface fileProcessorIn, stdIN resultsIn, IsPrime isPrimeIn) {
		// TODO Auto-generated constructor stub
    	Logger.writeMessage("Constructor called for Worker Thread class",DebugLevel.CONSTRUCTOR);
    	results = resultsIn;
		fileProcessor=fileProcessorIn;
		isPrime=isPrimeIn;
	}
    /**
     * Run method to execute thread
     */
	public synchronized void run() {
		 Logger.writeMessage("Run method called", DebugLevel.PRINT_RUN);
		String fileContent= null;
		int fileContentNumber;
		while((fileContent = fileProcessor.readLineFromFile())!=null){
			//System.out.println(Thread.currentThread().getName());
			fileContentNumber=Integer.parseInt(fileContent);
			bool = isPrime.checkPrime(fileContentNumber);
			if(bool)
			{	results.addNumber(fileContentNumber);
			}
		}
    }
    

}