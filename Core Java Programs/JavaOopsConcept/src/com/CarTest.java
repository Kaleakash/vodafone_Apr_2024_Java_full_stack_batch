package com;

public class CarTest {

	public static void main(String[] args) {
		//start();
	Car innova = new Car();
	Car bmw = new Car();
	Car santro = new Car(4,800000,"Red");
		//innova.start();
		//innova.stop();
		//innova.displayCarInfo();
		//bmw.displayCarInfo();
		
//		innova.wheel=4;
//		innova.colour="Gray";
//		innova.price=3500000;
		
	innova.setCarInfo(4,350000,"Gray");
	innova.setCarInfo(4,380000,"Gray");
	innova.setCarInfo(4,400000,"Gray");
		
//		bmw.wheel=4;
//		bmw.colour="White";
//		bmw.price=10000000;

	bmw.setCarInfo(4, 10000000, "white");
		innova.displayCarInfo();
		bmw.displayCarInfo();
		santro.displayCarInfo();
	}

}
