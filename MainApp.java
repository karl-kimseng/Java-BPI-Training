package M2_Act6;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car = new Car("Honda", 4);
		Truck Truck = new Truck("Dongfeng", 10);
		
		Car.startEngine();
		Truck.startEngine();
		
		refuelVehicle(Car);
		refuelVehicle(Truck);
		
		destroyVehicle(Car);
		destroyVehicle(Truck);
		
		}

		public static void refuelVehicle(Refuable brand) {
			brand.refuel();
		}

		public static void destroyVehicle(Vehicle brand) {
			brand.destroy();
		}
		
	}

