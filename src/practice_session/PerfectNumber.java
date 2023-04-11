package practice_session;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=scan.nextInt();
		int sum=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("PERFECT NUMBER");
		}
		else {
			System.out.println("NOT PERFECT NUMBER");
		}
	}
}
