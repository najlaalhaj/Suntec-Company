package suntec;

public class Developer extends Employee{
private double salary;
private double bonus;
private static double payPerHour=150.0;
private String typeOfContract;
private boolean cert;
public Developer(String firstName,String lastName,int idNumber,String gender,String typeOfContract,boolean cert){
	super(firstName,lastName,idNumber,gender);
	this.typeOfContract = typeOfContract;
	this.cert = cert;
	
}

public double getSalary() {
	return salary;
}

public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

public double getPayPerHour() {
	return Developer.payPerHour;
}


public void setPayPerHour(double payPerHour) {
	Developer.payPerHour = payPerHour;
}


public String getTypeOfContract() {
	return typeOfContract;
}

public void setTypeOfContract(String typeOfContract) {
	this.typeOfContract = typeOfContract;
}

public boolean isCert() {
	return cert;
}

public void setCert(boolean cert) {
	this.cert = cert;
}

public void salary(int experience,int nWorkingHours){
	if( getTypeOfContract().equalsIgnoreCase("Fixed")){
		{
			if((isCert()== true)&& ((experience>=0)&&(experience<=5))){
				salary = nWorkingHours*getPayPerHour();
			}else if((isCert()== true)&&(experience>5)&&(experience<10)){
				salary= (nWorkingHours*getPayPerHour())+(nWorkingHours*getPayPerHour()*0.5);
		
			}
			else if((isCert()== true)&&(experience>10)){
				salary = 3*(nWorkingHours*getPayPerHour());
			}
			else if(isCert()== false && (experience>=0)&&(experience<10)){
				salary = nWorkingHours*getPayPerHour()+ (experience*nWorkingHours*getPayPerHour()*0.1);
				
			}
		}
	}else if(getTypeOfContract().equalsIgnoreCase("Temporary")){
		if((experience>=0)&&(experience<5)){
			salary = (nWorkingHours*getPayPerHour())-(nWorkingHours*getPayPerHour()*0.1);
		}
			else if ((experience >=5)&&(experience<10)){salary = nWorkingHours*getPayPerHour()+(nWorkingHours*getPayPerHour()*0.1);}
			else salary = 2*(nWorkingHours*getPayPerHour());
	}
}

@Override
public void bonus() {
	this.bonus = 0.5*this.salary;
	
}

}