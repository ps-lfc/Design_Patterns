import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StringOperations {
	private FileProcessor fileProcessor = null;
	private TreeMap<String, Integer> countOccurence = null;
	private Integer MaxValue = 0;
	private String MaxKey = null;

	public StringOperations(FileProcessor fileProcessor_in) {
		fileProcessor = fileProcessor_in;
		countOccurence = new TreeMap<String, Integer>();
	}

	public void countOccurence() throws IOException {
		String localRead;
		String localReadValue[] = null;
		String mapKey = null;
		while ((localRead = fileProcessor.readLineFromFile()) != null) {
			if (localRead.contains("xs:element name=")) {
				localReadValue = localRead.split(" ");
				for (int index = 0; index < localReadValue.length; index++) {
					if (localReadValue[index].contains("name=")) {
						if (localReadValue[index].contains(">"))
							localReadValue[index] = localReadValue[index].substring(0,
									localReadValue[index].length() - 1);

						mapKey = localReadValue[index].substring(6, localReadValue[index].length() - 1);

						if (countOccurence.containsKey(mapKey)) {
							countOccurence.put(mapKey, countOccurence.get(mapKey) + 1);
						} else {
							countOccurence.put(mapKey, 1);
						}
					}
				}
			}
		}
	}

	public void finalOutput() {
		System.out
				.println("The most frequently occurring element is " + countOccurence.firstEntry().getKey() + ". It appears " + countOccurence.get(countOccurence.firstKey()) + " times ");
	}
}