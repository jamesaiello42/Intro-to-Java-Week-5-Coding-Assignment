package javaWeek5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asterLog =  new AsteriskLogger();
		asterLog.Log("hello there");
		
		// Line break
		System.out.println("");
		
		asterLog.Error("hello there");
	}

}
