package studentRecordsBackup.util;
import studentRecordsBackup.bst.*;
import studentRecordsBackup.bst.BST;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Observer;

public class BSTBuilder implements File_Interface {
	private FileReader fileReader = null;
	private String fileName = null;
	private ClassLoader classLoader = null;
	private URL urlToFilePath = null;
	private BufferedReader getSingleLine = null;
	static BST val=new BST();
	static BST val1=new BST();
	static BST val2=new BST();
	
	public BSTBuilder(String in_Filename) {
		this.fileName = in_Filename;
		classLoader = Thread.currentThread().getContextClassLoader();
		urlToFilePath = classLoader.getResource(getFileName());
		openFile();
	}
	/**
	 * Opens the input file found in args[0]
	 */
	private void openFile(){
		try {
			fileReader = new FileReader(new File(getFileName()));
			getSingleLine = new BufferedReader(fileReader);
			
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("File not found exception");
			System.exit(1);
		}
	}
	/**
	 * Reads the input file line by line and call put() in class BST.
	 */
	public void readLineFromFile() {
		String lineReadFromFile = null;
		try {	while((lineReadFromFile=getSingleLine.readLine())!=null){	
			int value=Integer.parseInt(lineReadFromFile);
			Node x = new Node(value);
			Node y = new Node(value);
			Node z = new Node(value);
			
			val.put(x);
			val1.put(y);
			val2.put(z);
			
			x.registerObserver(y, new EvenFilterImpl());
			x.registerObserver(z, new OddFilterImpl());
		}
			
		} catch (IOException e) {
			System.err.println("File Read exception");
			System.exit(1);
		}
		
		
	}
	/**
	 * All tree functions take place in this function including update, findMax etc.
	 * @param updateValue Second argument passed as command line
	 */
	public void printTree(int updateValue){
		
		System.out.println("Inorder Traversal for tree 1");
		val.inOrder();
		val.findMax();
		System.out.println("Inorder Traversal for tree 2");
		val1.inOrder();
		System.out.println("Inorder Traversal for tree 3");
		val2.inOrder();
		System.out.println("Sum of all nodes for tree 1");
		val.findSum();
		val.printSum();
		System.out.println("Sum of all nodes for tree 2");
		val1.findSum();
		val1.printSum();
		System.out.println("Sum of all nodes for tree 3");
		val2.findSum();
		val2.printSum();
		val.updateMax(updateValue);
		System.out.println("Updated Sum of all nodes for tree 1");
		val.findSum();
		val.printSum();
		System.out.println("Updated Sum of all nodes for tree 2");
		val1.findSum();
		val1.printSum();
		System.out.println("Updated Sum of all nodes for tree 3");
		val2.findSum();
		val2.printSum();
		
	}
	
	public String getFileName() {
		return fileName;
	}
	public URL getUrlToFilePath() {
		return urlToFilePath;
	}
}