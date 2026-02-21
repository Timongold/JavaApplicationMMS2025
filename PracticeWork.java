public class PracticeWork{
	public static void main(String[] args){
		//using the println method
		System.out.println("I am programming with my Java Software");
		System.out.println("It is a good thing to do");
		
		//using the print method
		System.out.print("This is fun, beleive me\n");
		System.out.print("Let's check this out");
		
		//using the printf method
		System.out.printf("My Name is Destiny, I am %d years old%n", 25);
		
		//Primitive DataType, for whole numbers
		byte age = 30;
		System.out.printf("I am %d years old%n", age);
		
		short quantityOfBags = 10500;
		System.out.printf("There are %d quantity of Rice Available%n", quantityOfBags);
		
		int worldsPopulation = 90000000;
		System.out.printf("The World's population is approximatly %d%n", worldsPopulation);
		
		long longNumbers = 9000000000000L;
		
		//Float point primitive Data
		float myAccountBalance = 10000344563.22098F;
		System.out.printf("My account balance is %.3f", myAccountBalance);
		
		double price = 233.4568;
		System.out.printf("The current price is %f%n", price);
		
		//Single data, primitive data type
		
		char symbol = '$';
		System.out.printf("The price in dollar is %c%.2f%n", symbol, price);
		
		//Boolean data type
		boolean decisionMaking = false;
		System.out.printf("Do you like food?, %b", decisionMaking);
		
	}
}

