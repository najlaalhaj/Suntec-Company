package suntecStaff;

public class Developer extends Employee {
	private Double bonus;
	private Double salary;

	public Developer(String firstName,String lastName,int id,Gender gender,String designation){
		super(firstName,lastName,id,gender,designation);
	}
	public Double getBonus(){
		return bonus;
	}
	public Double getSalary(){
		return salary;
	}

	public Double salary(){

}
}
