package suntec;

public class Main {

	public static void main(String[] args) {
	Designer designer = new Designer("Alain","Brundi",123,"Male"," ");
	Developer developer = new Developer("Najla","Alhaj",122,"FEMALE","temporary",false);
	Admin admin = new Admin("Helen","Haken",124,"Female");
	designer.setPayPerHour(90.0);
	designer.salary(10, 160);
	admin.salary(6,120);
System.out.println("The Designer Alain Brundi earns " + designer.getSalary());
developer.salary(2, 200);
System.out.println("The developer Alhaj earns "+ developer.getSalary() + " per month");
System.out.println("The Admin Helen Haken earns " + admin.getSalary());
	}

}
