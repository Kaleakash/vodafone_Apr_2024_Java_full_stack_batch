package inheritance;

public class Developer extends Employee{

	private String projectName;
	void readDev() {
		System.out.println("Enter the project name");
		projectName = sc.next();
	}
	void disDev() {
		System.out.println("Project name is "+projectName);
	}
}
