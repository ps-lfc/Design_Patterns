

package primeThreads.util;

public class IsPrime {
	/**
	 * Checks if the number is prime or not
	 * @param fileContent
	 * @return boolean value after checking for fileContent for prime
	 */
	public boolean checkPrime(int fileContent)
	{	if(fileContent%2 !=0)
		{	
			return true;
		}
	else
		return false;

	}
}
