package Lujainsingleton;

public class Lujainsingleton {
	
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
