package day6assignment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number");
		num=obj.nextInt();
		if(num>0) {
			for(int i=1;i<num;i++) {
				if(num%1==0) {
					sum=sum+i;
				}
			}
			if(sum==num) {
				System.out.println(num+" Is a perfect number");
			}
			else {
				System.out.println(num+" is not a perfect number");
			}
		}
		else {
			System.out.println("Enter the Positive Number");
		}

	}

}
