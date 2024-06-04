package inheritance;

public class Developer extends Employee{

	private String projectName;
	void readDev() {
		readEmp();		// id name,salary 
		System.out.println("Enter the project name");
		projectName = sc.next();		// project name
		add.readAdd();                // city and state 
	}
	void disDev() {
		disEmp();
		System.out.println("Project name is "+projectName);
		add.disAdd();
	}
}
