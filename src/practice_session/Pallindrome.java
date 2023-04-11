package practice_session;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=scan.nextInt();
		int num1=num;
		int rev = 0,r;
		while(num!=0) {
			r=num%10;
			 rev=rev*10+r;
			num=num/10;
		}
		if(rev==num1) {
			System.out.println("PALLINDROME NUMBER");
		}else {
			System.out.println("NOT PALLINDROME NUMBER");
		}
	}
}
