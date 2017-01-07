package genericCheckpointing.util;

public interface File_Interface {
	
	public void openFile();
	public void closeFile();
	public String readLineFromFile();
	public void filewriter(String output);
	public void openFileForWrinting();
}
