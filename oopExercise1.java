package M2_Act3;
import java.util.Scanner;
public class oopExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner input = new Scanner(System.in);
		
	//	System.out.println("What is your Name? ");
	//	String ownerName = input.next();

		Car car1 = new Car();
		Car car2 = new Car("James", "Innova", 2023);
		
		car1.printDetails();
		car2.printDetails();
		}
	}

