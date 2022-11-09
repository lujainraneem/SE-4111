
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
	
	private int lujainAgeConfig;
	
	/*
	 * Verify the age value entered
	 * @param age is a value of user age
	 * @return AgeOfUser is the number that entered by the user
	 */

	public void setLujainAgeConfig(int AgeOfUserConfig) {	
		if(AgeOfUserConfig>18) {
			this.lujainAgeConfig = AgeOfUserConfig;
	           System.out.println("you'r allowd");
	     }
	}
	
	public int getLujainAgeConfig() {
		return this.lujainAgeConfig;
	}


}
