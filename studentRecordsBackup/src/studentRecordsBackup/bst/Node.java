package studentRecordsBackup.bst;
import studentRecordsBackup.util.*;
import java.util.HashMap;
import java.util.Map;

public class Node implements SubjectI, ObserverI {
	public int val;
	public boolean flag = false;
	
	public Node left = null, right = null;
	int updateValue;
	public Map<ObserverI, OddEvenFilterI> Observers = null;
	/**
	 * Parametrised construtor
	 * @param valIn
	 */
	public Node(int valIn) {
		val = valIn;
		Observers = new HashMap<ObserverI, OddEvenFilterI>();
	}

	/**
	 * Register new observers
	 */
			
	public void registerObserver(ObserverI o, OddEvenFilterI f) {
		Observers.put(o, f);
	}
	/**
	 * Remove any observer
	 */
	public void removeObserver(ObserverI o) {
		Observers.remove(o);
	}
	/**
	 * Notify observers in case of any change
	 */
	public void notifyObservers(int updateValue) {
		for (Map.Entry<ObserverI, OddEvenFilterI> entry : Observers.entrySet()) {
			ObserverI observer = entry.getKey();
			OddEvenFilterI filter = entry.getValue();
			
			if (filter.checkValue(updateValue)) {
				observer.update(updateValue);
			}
		}
	}
	/**
	 * Update value of tree
	 */
	public void update(int updateValue) {
		this.val = this.val + updateValue;
		
	}
}