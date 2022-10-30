package se4111;

public class Singleton {
	private static Singleton ui;
		
	private Singleton() {}
	
	public static Singleton getiu() {
		System.out.println("Lujain Khaled Alduryhem");
		
		if (ui ==null) {
			ui = new Singleton();
		}
		return ui;		
	}	
}
