package genericCheckpointing.util;

import java.util.Random;

public class RandomGenerator {
	
	public static int randInt(int min, int max) {

	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static String generateString( int length)
	{
		Random rng = new Random();
		String characters = "abcdefghijklmnopqrstuvwxyz";
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
}
