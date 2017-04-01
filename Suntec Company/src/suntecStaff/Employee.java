package suntecStaff;

	public abstract class Employee {
		private String firstName;
		private String lastName;
		private int id;
	    private Gender gender;
	    private String designation;
	    
	    public Employee(String firstName,String lastName,int id,Gender gender,String designation){
	    	this.firstName= firstName;
	    	this.lastName= lastName;
	    	this.id= id;
	    	this.gender=gender;
	    	this.designation=designation;
	    }
	    public abstract Double bonus();
	    public abstract Double  salary();
	    
	}


