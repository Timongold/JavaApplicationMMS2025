import java.util.Scanner; //all class in a package must start with a capital letter eg Scanner

public class UserInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = scan.nextLine(); //string is a class and starts with capital. nextLine() is a method that can get a string. next() method gets online the first name
		
		
		System.out.print("Enter your address: ");
		String address = scan.nextLine();
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		scan.nextLine(); //what it will do is to clear every line that is having an issue
		
		System.out.printf("Hello %s, How are you today?", fullName);
		System.out.printf("%nNice meeting you, you are living in %s%n", address);
		System.out.printf("%s, you are %d years old", fullName, age);
	}
}