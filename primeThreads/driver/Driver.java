
package primeThreads.driver;
import primeThreads.store.Results;
import primeThreads.store.StdoutDisplayInterface;
import primeThreads.store.stdIN;
import primeThreads.threadMgmt.CreateWorkers;
import primeThreads.util.FileProcessor;
import primeThreads.util.File_Interface;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;	

public class Driver{

	public static void main(String args[]) {
		if(args.length != 3) {
			System.err.println("Usage Improper: Please provide the arguments as per the assignemnt requirement");
			System.exit(1);
		}
		String threads = args[1];
		int NUM_THREADS = Integer.parseInt(args[1]);
		if(NUM_THREADS<1 || NUM_THREADS>5){
			System.err.println("Usage Improper: Please provide the number of threads as per the assignemnt requirement");
			System.exit(1);
		}
		int DEBUG_VALUE = Integer.parseInt(args[2]);
		if(DEBUG_VALUE<0 || DEBUG_VALUE>4){
			System.err.println("Usage Improper: Please provide the debug value as per the assignemnt requirement");
			System.exit(1);
		}
		Logger.setDebugValue(DEBUG_VALUE);

		File_Interface fileProcessor = new FileProcessor(args[0]);
		stdIN results= new Results();
		IsPrime isPrime= new IsPrime();		
		CreateWorkers createWorker= new CreateWorkers(fileProcessor,results,isPrime);
		createWorker.startWorkers(NUM_THREADS);
		((StdoutDisplayInterface)results).writeSumToScreen();;


	} // end main(...)

} // end public class Driver

