package genericCheckpointing.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class FileProcessor implements File_Interface {
	public FileWriter writer;
	public BufferedWriter filewriter;
	private FileReader fileReader = null;
	private String fileName = null;
	private ClassLoader classLoader = null;
	private URL urlToFilePath = null;
	private BufferedReader getSingleLine = null;

	public FileProcessor(String in_Filename) {
		this.fileName = in_Filename;
		classLoader = Thread.currentThread().getContextClassLoader();
		urlToFilePath = classLoader.getResource(getFileName());
	}
	public void openFile() {
		try {
			fileReader = new FileReader(new File(getFileName()));
			getSingleLine = new BufferedReader(fileReader);
		
		} catch (IOException ioException) {
			System.err.println("File not found exception");
			System.exit(0);
		}
	}

	public void openFileForWrinting() {
		try {
			writer=new FileWriter(getFileName());
			filewriter = new BufferedWriter(writer);

		} catch (IOException e) {
			System.err.println("IO Exception");
			System.exit(0);

		}
		
	}
	public synchronized String readLineFromFile() {
		String lineReadFromFile = null;
		try {
			lineReadFromFile = getSingleLine.readLine();
		} catch (IOException e) {
			System.err.println("File Read exception");
			System.exit(0);
		}
		return lineReadFromFile;
	}
	public void filewriter(String output){
		try {
			filewriter.write(output);
		} catch (IOException e) {
			System.err.println("Write to file fail");
			System.exit(0);

		}
	}
	@Override
	public void closeFile() {
		try {
			filewriter.close();
		} catch (IOException e) {
			System.err.println("File close exception");
			System.exit(0);
		}
	}
	public String getFileName() {
		return fileName;
	}
	public URL getUrlToFilePath() {
		return urlToFilePath;
	}
}