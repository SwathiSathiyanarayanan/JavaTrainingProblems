package com.wissen.JavaPracticePrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		
		int temp,rem,sum=0;
		
		temp=number;
		
		while(temp!=0) {
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==number) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
