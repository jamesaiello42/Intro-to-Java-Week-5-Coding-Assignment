package javaWeek5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String info) {
		// Log string with three asterisk to the each side of the string
		System.out.println("***" + info + "***");	
	}

	@Override
	public void Error(String info) {
		// These variables are needed to correctly output the box around the error message
		String error = "Error: ";
		int length = 6 + info.length() + error.length();
		String box = "";
		
		// Create dynamic box based off length of pass in string
		for (int i = 0; i < length; i++)
			box += "*";
		
		// Output error with message with asterisks around it
		System.out.println(box);
		System.out.println("***" + error + info + "***");
		System.out.println(box);
		
	}

}
