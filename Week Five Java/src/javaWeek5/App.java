package javaWeek5;

public class App {

	public static void main(String[] args) {
		// Initiate an object of the AsteriskLogger and SpacedLogger classes
		Logger asterLog =  new AsteriskLogger();
		Logger spaceLog =  new SpacedLogger();
		
		// Test strings
		String testStr = "Hello there, my friend.";
		String testStrTwo = "Jazz";
		String testStrThree = "James";
		String testStrFour = "supercalifragilisticexpialidocious";
		
		// Test case 1 for AsteriskLogger and SpacedLogger classes
		testCases(asterLog, testStr);
		testCases(spaceLog, testStr);
		
		// Test case 2 for AsteriskLogger and SpacedLogger classes
		testCases(asterLog, testStrTwo);
		testCases(spaceLog, testStrTwo);
		
		// Test case 3 for AsteriskLogger and SpacedLogger classes
		testCases(asterLog, testStrThree);
		testCases(spaceLog, testStrThree);
		
		// Test case 4 for AsteriskLogger and SpacedLogger classes
		testCases(asterLog, testStrFour);
		testCases(spaceLog, testStrFour);
				
	}
	
	// This method is intended to save me from doubling my code for each test case
	public static void testCases(Logger logger, String testStr)
	{
		
		logger.Log(testStr);
		logger.Error(testStr);
		System.out.println("");
		
	}

}
