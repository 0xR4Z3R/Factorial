package fac;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		for (int i=0; i<=num;i++) {
			System.out.println( i + "! is " + factorial(i));
		}
		
		
	}
	
	public static int factorial(int n){
		int result = 1;
		for (int i=2;i<=n; i++)
			result *= i;
		return result;
	}

}
