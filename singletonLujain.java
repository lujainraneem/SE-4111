
public class singletonLujain {
	
private static singleton ui;
	
	private singleton() {
		System.out.println("Lujain khalid Alduryhem");
	}
	
	public static singleton getiu() {
				
		if (ui ==null) {
			ui = new singleton();
		}
		return ui;		
	}


}
