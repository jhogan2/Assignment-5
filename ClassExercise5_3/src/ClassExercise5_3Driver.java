import java.util.Scanner;

public class ClassExercise5_3Driver {
	public static void main(String [] args) {
		//String color1;
		Scanner keyboard = new Scanner(System.in);
		ClassExercise5_3 car1 = new ClassExercise5_3("white","500","3");
		System.out.println(car1);
		ClassExercise5_3 car2 = new ClassExercise5_3("red","200","2");
		System.out.println(car2);
		ClassExercise5_3 car3 = new ClassExercise5_3();
		System.out.println("what is the color of the car3: ");
		String color3=keyboard.nextLine();
		car3.setcarcolor(color3);
		System.out.println("what is the horsepower  of the car3: ");
		String hp3 =keyboard.nextLine();
		car3.sethorsepower(hp3);
		System.out.println("what is the enginesize  of the car3: ");
		String esize3=keyboard.nextLine();
		car3.setenginesize(esize3);
		System.out.println(car3);
		keyboard.close();
	}	
}

