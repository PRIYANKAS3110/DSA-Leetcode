package basic;

public class PrintallDivisorsofagivenNumber{
		
	public static void main(String[] args){
		
		printDivisorsBruteForce(36);
		
	}

	static void printDivisorsBruteForce(int n){
		System.out.println("The Divisors of "+n+" are:");
		for(int i = 1; i <= n; i++)
			if(n % i == 0)
				System.out.print(i + " ");
			
		System.out.println();
	}
	
}