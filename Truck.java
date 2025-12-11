package M2_Act6;

public class Truck extends Vehicle implements Refuable{
	
	public Truck(String brand, int numberOfWheels) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(numberOfWheels + "-wheeler" + brand + " is refueled.");
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(numberOfWheels + "-wheeler "+ brand + " is starting it's engine.");
	}

}
