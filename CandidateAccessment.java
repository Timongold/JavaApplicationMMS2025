import java.util.Scanner;

public class CandidateAccessment {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Candidate, please enter your full name: ");
		String fullName = input.nextLine();
		
		System.out.print("Candidate, please enter your Score for your English Test: ");
		int englishTest = input.nextInt();
		
		System.out.print("Candidate, please enter your Score for your Maths Test: ");
		int mathsTest = input.nextInt();
		
		System.out.print("Candidate, please enter your Score for your ICT Test: ");
		int ictTest = input.nextInt();
		
		int averageScore = (englishTest + mathsTest + ictTest)/3;
		System.out.printf("Your average is %d%n", averageScore);
		
	
		
		if (englishTest > 75 && averageScore >= 80 ){
			System.out.printf("Your English Test score is %d and your Average is %d%n Employment Granted!", englishTest, averageScore);
			
		}
		else{
			System.out.printf("Your English Test score is %d and your Average is %d%n Employment denied!", englishTest, averageScore);
		}
		
	}
}