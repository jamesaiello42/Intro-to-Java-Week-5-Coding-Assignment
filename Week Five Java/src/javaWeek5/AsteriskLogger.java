package javaWeek5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String info) {
		System.out.println("***" + info + "***");	
	}

	@Override
	public void Error(String info) {
		int length = 6 + info.length();
		String box = "";
		
		for (int i = 0; i < length; i++)
			box += "*";
		
		System.out.println(box);
		System.out.println("***" + info + "***");
		System.out.println(box);
		
	}

}
