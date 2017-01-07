
package primeThreads.threadMgmt;

import java.util.ArrayList;


import primeThreads.store.Results;
import primeThreads.store.stdIN;
import primeThreads.util.File_Interface;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class CreateWorkers  {
	File_Interface  FPI= null;
	stdIN Re=null;
	IsPrime Pe=null;
	/*
	 * This is a parameterized constructor
	 */
	public CreateWorkers(File_Interface FPIIN, stdIN ReIN, IsPrime PeIN)
	{	Logger.writeMessage("Constructor called for Create Worker class",DebugLevel.CONSTRUCTOR);
		Re = ReIN;
		FPI=FPIIN;
		Pe=PeIN;

    // this class has the method startWokers(...)
	}
	/**
	 * Creates the threads
	 * @param NUM_THREADS Total number of threads
	 */
	public void startWorkers(int NUM_THREADS)
	{	ArrayList<Thread> arraylist = new ArrayList<Thread>();
		for(int i=0;i<NUM_THREADS;i++)
		{	Runnable R=new WorkerThread(FPI,Re,Pe);
			Thread t= new Thread(R,"Thread:"+i);
			arraylist.add(t);
			t.start();
		}
		for(int i=0;i<NUM_THREADS;i++)
		{	try {
			arraylist.get(i).join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("Thread Processing Error "+e.getStackTrace().toString());
		}			
		}
	}
}