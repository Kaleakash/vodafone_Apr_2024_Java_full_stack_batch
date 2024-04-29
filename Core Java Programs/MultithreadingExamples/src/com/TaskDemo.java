package com;
class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
	}
}
public class TaskDemo {
	public static void main(String[] args) {
	Task tt = new Task();
	Thread clien1 = new Thread(tt);
	Thread clien2 = new Thread(tt);
	Thread clien3 = new Thread(tt);
	clien1.setName("client1");
	clien2.setName("client2");
	clien3.setName("client3");
	clien1.start();
	clien2.start();
	clien3.start();
	Thread t = Thread.currentThread();
	System.out.println(t);
	}

}
