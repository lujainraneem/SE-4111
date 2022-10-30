package aa;

public class singleton {
	private static singleton ui;
	
	private singleton() {}
	
	public static singleton getiu() {
		System.out.println("Raneem khalid aldumaykhi");
		
		if (ui ==null) {
			ui = new singleton();
		}
		return ui;		
	}

}
