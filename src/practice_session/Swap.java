package practice_session;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int a=scan.nextInt();
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
