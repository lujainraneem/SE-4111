package se4111;

public class Singleton {
	private static Singleton ui;
		
	private Singleton() {
		System.out.println("Lujain Khaled Alduryhem");
	}
	
	public static Singleton getiu() {
			
		if (ui ==null) {
			ui = new Singleton();
		}
		return ui;		
	}	
}
