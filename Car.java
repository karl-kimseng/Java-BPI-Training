package M2_Act6;

public class Car extends Vehicle implements Refuable{

	public Car(String brand, int numberOfWheels) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(brand + " is refueled.");
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(brand + " is starting it's engine.");
	}

}
