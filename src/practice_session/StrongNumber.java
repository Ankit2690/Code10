package practice_session;

import java.util.Scanner;

public class StrongNumber {
	
	public static int fact(int n) {
		int fact=1;
		while(n!=0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sum=0,temp=num,r;
		while(num!=0) {
			r=num%10;
			sum=sum+fact(r);
			num=num/10;
		}
		if(sum==temp)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}
}
