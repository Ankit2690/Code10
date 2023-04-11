package practice_session;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter limit");
		int num=scan.nextInt();
		for(int i=0;i<=num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
