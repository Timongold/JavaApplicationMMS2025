import java.util.Scanner;


public class PracUserInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter your Full Name: ");
		String fullName = scan.nextLine();
		System.out.printf("Hello %s, You are welcome. How may I help you? %n", fullName);
		System.out.println("");
		
		System.out.print("Please enter your address: ");
		String address = scan.nextLine();
		System.out.printf("Your Name is %s and you live at %s%n", fullName, address);
		System.out.println("");
		
		System.out.print("Please Enter your Age: ");
		int age = scan.nextInt();
		System.out.print("");
		
		System.out.printf("Your name is %s, you live at %s and your are %d years old", fullName, address, age);
	}
}