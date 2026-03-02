//write a java that will write all the even numbers from 100 to 1
public class EvenNumberInDesendingOrder{
	public static void main(String[] args){
		for(int i = 100; i >= 1 ; i--){
			if(i % 2 == 0){
				System.out.printf("%d is an even number%n", i);
			}
		}
	}
}