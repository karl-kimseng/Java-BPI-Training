package M2_Act3;

public class Car {

	String carOwner = "Karl";
	String carModel = "HRV";
	int carYear = 2015;
	
	public Car() {
		
	}
	
	public Car(String carOwner, String carModel, int carYear) {
		this.carOwner = carOwner;
		this.carModel = carModel;
		this.carYear = carYear;
	}
	
	public String getCarOwner() {
		return this.carOwner;
	}
	
	public String getCarModel() {
		return this.carModel;
	}
	
	public int getCarYear() {
		return this.carYear;
	}
	
	public void printDetails() {	
		String printText = "Your car's details is: " + getCarOwner() + ", " + getCarModel() + ", " + getCarYear();
		System.out.println(printText);
	}
			

}// end class
