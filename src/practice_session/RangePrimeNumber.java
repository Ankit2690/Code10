package practice_session;

import java.util.Scanner;

public class RangePrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
}
