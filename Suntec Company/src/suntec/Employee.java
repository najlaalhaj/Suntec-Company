package suntec;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int idNumber;
    private String gender;
  
    
    public Employee(String firstName,String lastName,int id,String gender){
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.idNumber = id;
    	this.gender = gender;
    	
    	
    }
 
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdNumber() {
		return idNumber;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public abstract void salary(int experience,int numberOfWorkingHours);
    public abstract void bonus();
}