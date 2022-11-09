package aa;

public class singleton {
	private static singleton ui;
	private int raneemSalaryConfig;
	/**
	 * verify the salary of user is > 7000
	 * @param  raneemSalaryConfig is the salary of user that entered
	 * return raneemSalaryConfig is the salary that entered by user 
	 */
	
	public int getRaneemSalaryConfig() {
		return raneemSalaryConfig;
	}

	public void setRaneemSalaryConfig(int raneemSalaryConfig) {
		this.raneemSalaryConfig = raneemSalaryConfig;
		if(raneemSalaryConfig>6000) {
	           System.out.println("you'r loan worthy");
	        }
	}

	private singleton() {}
	
	public static singleton getiu() {
		
		if (ui ==null) {
			ui = new singleton();
		}
		return ui;		
	}

}
