import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("Usage Improper: Please provide the arguments as per the assignemnt requirement");
			System.exit(1);
		}
		FileProcessor fileProcessor = new FileProcessor(args[0]);
			fileProcessor.openFile();
			fileProcessor.readLineFromFile();
			StringOperations stringOperations = new StringOperations(fileProcessor);
			try {
				stringOperations.countOccurence();
				stringOperations.finalOutput();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error in reading from class StringOperations");
				System.exit(1);
			}
	}
}