package inheritance;

public class Manager extends Employee{
private int numberOfEmp;

	void readMgr() {
		readEmp();
		System.out.println("Enter the number of emp");
		numberOfEmp = sc.nextInt();
	}
	void disMgr() {
		disEmp();
		System.out.println("Number of emp"+numberOfEmp);
	}
}
