package practice_session;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scan.nextInt();
		int temp1=num,length=0;
		while(num!=0) {
			length=length+1;
			num=num/10;
		}
		int temp2=temp1,arm=0,rem;
		while(temp2!=0) {
			int mul=1;
			rem=temp2%10;
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if(arm==temp1)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
