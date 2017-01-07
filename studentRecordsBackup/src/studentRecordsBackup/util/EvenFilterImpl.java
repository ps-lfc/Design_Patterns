package studentRecordsBackup.util;

public class EvenFilterImpl implements OddEvenFilterI{
	/**
	 * Check if value of update value is true or false
	 * Boolean flag return
	 */
	public boolean checkValue(int updateValue){
		boolean check = false;
		if(updateValue%2==0){
			check=true;
		}
		return check;
	}
}
