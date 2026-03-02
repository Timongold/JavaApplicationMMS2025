import java.util.Scanner;

public class MineAlphabetCheck {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter any Alphabet: ");
		Char alphabet = input.next.charAt(0);
		
		if (alphabet = a|| e || i|| o|| u|| A|| E|| I|| O|| U){
			System.out.printf("%s is a a vowel sound", alphabet);
		}
		else{
			System.out.printf("%s is a consonant sound", alphabet);
		}
	}
}