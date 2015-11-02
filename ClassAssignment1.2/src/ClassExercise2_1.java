/*
 * Name: James Hogan
 * Date: 2 November 2015
 * Email: jth1ogan3@gmail.com
 * The purpose of this program is to ask for ten numbers and get the average for all 
 * the numbers.
 */
import java.util.Scanner;


public class ClassExercise2_1 {
	public static void main (String [] args){
		Scanner keyboard; //variable for the inputs
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num0; // variable for storing the inputs
		int avg= 0; // variable for the average of the inputs
		keyboard=new Scanner(System.in);
		System.out.println("Enter 10 numbers(use a comma inbetween): ");
		keyboard.useDelimiter(",");
		//getting all the numbers from the user
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		num3 = keyboard.nextInt();
		num4 = keyboard.nextInt();
		num5 = keyboard.nextInt();
		num6 = keyboard.nextInt();
		num7 = keyboard.nextInt();
		num8 = keyboard.nextInt();
		num9 = keyboard.nextInt();
		num0 = keyboard.nextInt();
		System.out.println("\t" + "inputs received");
		avg=((num1+num2+num3+num4+num5+num6+num7+num8+num9+num0)/10); //calculating the average
		System.out.println("The average is"+ "\n"+"\"" + avg + "\"");
		keyboard.close();// make sure the Scanner class is closed 
	}
}
