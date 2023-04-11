package practice_session;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int num=scan.nextInt();
	int count=0;
	for(int i=2;i<=num-1;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println("PRIME NUMBER");
	}
	else
		System.out.println("NOT PRIME NUMBER");
}
}
