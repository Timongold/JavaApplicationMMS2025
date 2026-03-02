import java.util.Scanner;

public class MultipleSelectionIf_Esle_If {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter full name: ");
		String fullName = input.nextLine();
		
		System.out.print("Please enter your mark: ");
		int mark = input.nextInt();
		
		if (mark >= 0 && <= 100){
		
		if (mark >= 80) {
			System.out.printf("%s your mark is %d: your Grade A (Outstanding)%n", fullName, mark);
		}
		else if(mark >= 70){
			System.out.printf("%s your mark is %d: your Grade B (Excellent)%n", fullName, mark);
		}
		
		else if(mark >= 60){
			System.out.printf("%s your mark is %d: your Grade C (Good)%n", fullName, mark);
		}
		else if(mark >= 50){
			System.out.printf("%s your mark is %d: your Grade D (Average)%n", fullName, mark);
		}
		else if(mark >= 40){
			System.out.printf("%s your mark is %d: your Grade E (Satisfactory)%n", fullName, mark);
		}
		else {
			System.out.printf("%s your mark is %d: your Grade F  (Satisfactory)%n", fullName, mark);
		}
		}
		else{
			System.out.println("Mark cannot be greater than 100");
		}
	}
}