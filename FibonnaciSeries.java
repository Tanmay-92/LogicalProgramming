package day6assignment;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner Num1 = new Scanner(System.in);
		int N;
		int i;
		int a=0;
		int b=1;
		int c;
		System.out.println("Enter the Number");
		N=Num1.nextInt();
		System.out.println(a+","+b);
		for(i=1;i<=N;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		}

	}


