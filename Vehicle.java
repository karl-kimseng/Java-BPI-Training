package M2_Act6;

public abstract class Vehicle {
	int numberOfWheels;
	String brand;
		
	abstract void startEngine();
	void destroy() {
		System.out.println("The " + numberOfWheels + "-wheeler " +  brand + " is destroyed");
	}
}

	