package inheritance;

public class Manager extends Employee{
private int numberOfEmp;

	void readMgr() {
		System.out.println("Enter the number of emp");
		numberOfEmp = sc.nextInt();
	}
	void disMgr() {
		System.out.println("Number of emp"+numberOfEmp);
	}
}
