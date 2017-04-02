package suntec;

import java.util.ArrayList;
public class HR {
ArrayList<Designer>designers = new ArrayList();
ArrayList<Developer>developers = new ArrayList();
ArrayList<Admin>admins = new ArrayList();
public void addDesigner(Designer designer){
	designers.add(designer);
	
}
public void addDeveloper(Developer developer){
	developers.add(developer);
}
public void addAdmin(Admin admin){
	admins.add(admin);
}
}
