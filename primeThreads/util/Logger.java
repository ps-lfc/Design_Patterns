
package primeThreads.util;

public class Logger{


    public static enum DebugLevel { 
    	OUTPUT_MESSAGE,PRINT_CONTENT,PRINT_DATASTRUCTURE,PRINT_RUN,CONSTRUCTOR, 
                                   };

    private static DebugLevel debugLevel;

    /** 
     * Runs cases for debug levels.
     * @param levelIn Check for debug levels
     */
    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	case 0:debugLevel = DebugLevel.OUTPUT_MESSAGE; break;
	case 1:debugLevel = DebugLevel.PRINT_CONTENT; break;
	case 2:debugLevel = DebugLevel.PRINT_DATASTRUCTURE; break;
	case 3:debugLevel = DebugLevel.PRINT_RUN; break;
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
    	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
