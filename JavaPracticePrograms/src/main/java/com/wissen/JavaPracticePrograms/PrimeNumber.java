package com.wissen.JavaPracticePrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime=true;
		
		for(int i=2;i<10;i++) {
			isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					isPrime=false;
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
