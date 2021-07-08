package day6assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Num1 = new Scanner(System.in);
		System.out.println("Enter any number");
		int X=Num1.nextInt();
		int temp=0;
		for(int i=2;i<=X-1;i++) {
			if (X%i==0) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println(X+"is prime Number");
		}
		else {
			System.out.println(X+"is not a Prime");
		}
	}

}
