package interfacetest;

public class Sbi implements Bank {

	@Override
	public void withdraw(int accno, float amount) {
		System.out.println("sbi withdrawn logic");

	}

	@Override
	public void deposit(int accno, float amount) {
		System.out.println("sbi deposit logic");

	}

	@Override
	public void transferamount(int to, int from, float amout) {
		System.out.println("sbi transfer logic");

	}

}
