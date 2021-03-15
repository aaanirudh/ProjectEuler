import java.util.ArrayList;

public class ProjectEuler {

	public static void main(String[] args) {
		/*
		System.out.println(problem1(1000));
		System.out.println(problem2(4000000));
		System.out.println(problem3(600851475143L));
		System.out.println(problem4());
		System.out.println(problem5());
		System.out.println(problem6(100));
		 */
		
		
	}
	public static int problem1(int max) {
		int sum = 0;
		for(int i = 1; i < max; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static int problem2(int max) {
		int fib1 = 0;
		int fib2 = 1;
		int sum = 0;
		while(fib1 < max && fib2 < max) {
			fib1 = fib1 + fib2;
			fib2 = fib1 + fib2;
			if(fib1 % 2 == 0) {
				sum += fib1;
			}
			if(fib2 % 2 == 0) {
				sum += fib2;
			}
		}
		return sum;
	}
	public static long problem3(long num) {
		ArrayList<Long> factors = new ArrayList<Long>();
		long i = 2;
		while(!isPrime(num)) {
			if(num % i == 0) {
				factors.add(i);
				num = num / i;
			}
			else {
				i++;
			}
		}
		factors.add(num);
		long max = 1;
		for(int j = 0; j < factors.size(); j++) {
			if(factors.get(j) > max) {
				max = factors.get(j);
			}
		}
		return max;
	}
	public static boolean isPrime(long num) {
		for(long i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int problem4() {
		int max = 0;
		for(int i = 999; i > 99; i--) {
			for(int j = 999; j > 99; j--) {
				if(isPalindrome(i * j) && i * j > max) {
					max = i * j;
				}
			}
		}
		return max;
	}
	public static boolean isPalindrome(int num) {
		String temp = String.valueOf(num);
		for(int i = 0; i < temp.length()/2; i++) {
			if(temp.charAt(i) == temp.charAt(temp.length() - i - 1)) {
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static long problem5() {
		long fact = factorial(20);
		for(int i = 21; i < fact; i++) {
			boolean flag = true;
			for(int j = 2; j < 21 && flag; j++) {
				if(i % j != 0) {
					flag = false;
				}
			}
			if(flag) {
				return i;
			}
		}
		return fact;
	}
	public static long factorial(int num) {
		long fact = 1;
		for(int i = num; i > 1; i--) {
			fact *= num;
		}
		return fact;
	}
	public static long problem6(int num) {
		long sumOfSquares = 0;
		for(int i = 1; i <= num; i++) {
			sumOfSquares += i;
		}
		sumOfSquares = sumOfSquares * sumOfSquares;
		for(int i = 1; i <= num; i++) {
			sumOfSquares = sumOfSquares - i * i;
		}
		return sumOfSquares;
	}
}
