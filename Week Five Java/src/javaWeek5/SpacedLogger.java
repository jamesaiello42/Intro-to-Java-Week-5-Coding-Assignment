package javaWeek5;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String info) {
		
		// loop through passed in string to have a space between every char
		for (int i = 0; i < info.length(); i++)
		{
			// This statement is prevent having a space at the end of the printed string
			if (i != info.length() - 1)
				System.out.print(info.charAt(i) + " ");
			else 
				System.out.print(info.charAt(i));
		}
		
		// Advance by one line
		System.out.print("\n");
		
	}

	@Override
	public void Error(String info) {
		// Print that an error has occurred
		String error = "Error: ";
		System.out.print(error);
		
		// Then loop through passed in string to have space between every char
		for (int i = 0; i < info.length(); i++)
		{
			// This statement is prevented from having a space at the end of the printed string
			if (i != info.length() - 1)
				System.out.print(info.charAt(i) + " ");
			else 
				System.out.print(info.charAt(i));
		}
			
		// Advance by one line
		System.out.print("\n");
		
	}

}
