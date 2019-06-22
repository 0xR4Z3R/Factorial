# Factorial
Factorial
passing numbers from 0 to num to factorial()

and return factorrial result for each number
//---------------------------------------
Output
//--------------------------------
0! is 1
1! is 1
2! is 2
3! is 6
4! is 24
5! is 120
6! is 720
7! is 5040
8! is 40320
9! is 362880
10! is 3628800
//----------------------------------------

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
