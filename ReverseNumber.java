package day6assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int A=obj.nextInt();
		int rem,rev=0;
		while(A !=0) {
			rem=A%10;
			rev=rev*10+rem;
			A=A/10;
		}
		System.out.println("the Reverse number is:"+rev);

	}

}
