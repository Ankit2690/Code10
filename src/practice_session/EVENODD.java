package practice_session;

import java.util.Scanner;

public class EVENODD {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("EVEN NUMBER");
		}
		else {
			System.out.println("ODD NUMBER");
		}
	}
}
