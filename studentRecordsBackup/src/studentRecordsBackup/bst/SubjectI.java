package studentRecordsBackup.bst;
import studentRecordsBackup.util.OddEvenFilterI;
public interface SubjectI 
{
	public void registerObserver(ObserverI o,OddEvenFilterI f);
	public void removeObserver(ObserverI o);
	public void notifyObservers(int updateValue);
}
