package suntec;

public class Designer extends Employee {
	private double salary; 
	private double bonus;
	private static double payPerHour = 200;
	private String qualification;
	
	public Designer (String firstName,String lastName,int idNumber,String gender,String qualification){
		super(firstName,lastName,idNumber,gender);
		this.qualification = qualification;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getPayPerHour() {
		return Designer.payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		Designer.payPerHour = payPerHour;
	}

		
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	} 

	public void salary(int experience,int numberOfWorkingHours){
		double basicSalary;
		switch(getQualification()){
		case "BSc":
			if((experience>=0)&&(experience<5)){
				basicSalary = numberOfWorkingHours*(getPayPerHour());
				salary = basicSalary+ (basicSalary*0.1);
			}
				else if ((experience>=5) && (experience<10)){
					basicSalary = numberOfWorkingHours*(getPayPerHour());
					salary = basicSalary+(basicSalary * 0.2);
					}
					else if (experience>=10){
						basicSalary = numberOfWorkingHours*(getPayPerHour());
						salary = basicSalary + (basicSalary*0.5);
					}
				
		case "MSc":
			if((experience>=0)&&(experience<5)){
				basicSalary = numberOfWorkingHours*(getPayPerHour());
				salary = basicSalary + (basicSalary*0.3);
			}
			else if((experience>=5)&&(experience<10)){
				basicSalary = numberOfWorkingHours * (getPayPerHour());
				salary = basicSalary+ (basicSalary*0.4);
			}
			else if(experience>= 10){
				basicSalary = numberOfWorkingHours*(getPayPerHour());
				salary= 2*basicSalary;
			}
		case "PhD":
			basicSalary = numberOfWorkingHours*getPayPerHour();
			salary= 3*basicSalary;
		case " ": if(experience>= 10){
			basicSalary = numberOfWorkingHours*getPayPerHour();
			salary = 2.5*basicSalary;
		}
		else if ((experience>=5)&&(experience<10)){
			basicSalary = numberOfWorkingHours*(getPayPerHour());
			salary = basicSalary+ (basicSalary*0.1);
		}
		else if ((experience>=0)&&(experience<5)){
			salary = numberOfWorkingHours*(getPayPerHour());
		} 
	
		
		}	
		}

	@Override
	public void bonus() {
		this.bonus = 0.1*this.salary;
	}
		}
	


