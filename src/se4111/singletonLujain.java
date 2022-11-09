
public class singletonLujain {
	
private static singleton ui;
	
	private singleton() {
		System.out.println("Lujain khalid Alduryhem");
	}
	
	private int lujainConfig;
	
	public static singleton getiu() {
				
		if (ui ==null) {
			ui = new singleton();
		}
		return ui;		
	}
	
/*
 * this function to set port number
 * @param port number
 * 
 * 	
 */
    public void setConfig1(int con) {
	    assert con>18
	    lujainConfig=con;
    }

    public int getConfig1() {
    	return lujainConfig;
    }

}
