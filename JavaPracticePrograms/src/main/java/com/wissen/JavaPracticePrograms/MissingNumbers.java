package com.wissen.JavaPracticePrograms;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] array= {1,3,4,5,6};
		
		int n=array.length+1;
		
		int sum=n*(n+1)/2;
		int resultSum=0;
		
		for(int i=0;i<array.length;i++) {
			resultSum=resultSum+array[i];
		}
		int missingNumber=sum-resultSum;
		System.out.println(missingNumber);
	}
}
