package javaWeek5;

public interface Logger {
	
	// These methods will be implemented by classes SpacedLogger and AsteriskLogger
	public void Log(String info);
	public void Error(String info);

}
