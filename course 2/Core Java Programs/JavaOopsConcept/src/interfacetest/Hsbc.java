package interfacetest;

public class Hsbc implements Bank {

	@Override
	public void withdraw(int accno, float amount) {
		System.out.println("Hsbc withdrawn logic");

	}

	@Override
	public void deposit(int accno, float amount) {
		System.out.println("Hsbc deposit logic");

	}

	@Override
	public void transferamount(int to, int from, float amout) {
		System.out.println("Hsbc transfer logic");

	}

}
