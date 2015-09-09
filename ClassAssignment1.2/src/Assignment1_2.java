import java.util.Scanner;
public class Assignment1_2 {
	public static void main(String[] args) {
		System.out.print("Enter your username:");
		Scanner scanner = new Scanner(System.in);
		String username= scanner.nextLine();
		System.out.print("Enter your password:");
		Scanner password1 = new Scanner(System.in);
		String password= password1.nextLine();
		System.out.print("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password);
				
		
	}
}
