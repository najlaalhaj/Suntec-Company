package suntec;

public class Admin extends Employee{
	private static double payPerHour = 120;
	private double salary;
	private double bonus;
	Admin(String firstName,String lastName,int idNumber,String gender){
		super(firstName,lastName,idNumber,gender);
	}
	

	public double getSalary() {
		return salary;
	}


	public double getBonus() {
		return bonus;
	}


	public static double getPayPerHour() {
		return payPerHour;
	}


	public static void setPayPerHour(double payPerHour) {
		Admin.payPerHour = payPerHour;
	}


	@Override
	public void salary(int experience, int numberOfWorkingHours) {
		if((experience>=0)&&(experience<=3)){
			salary = numberOfWorkingHours*getPayPerHour();
		}else if((experience >= 4)&&(experience < 7)){
			salary = 2*numberOfWorkingHours*getPayPerHour();
		}else if(experience>=7){
			salary = 3*numberOfWorkingHours*getPayPerHour();
		}
			
		
	}

	@Override
	public void bonus() {
		this.bonus= 0.5*(this.salary);
		
	}

}
