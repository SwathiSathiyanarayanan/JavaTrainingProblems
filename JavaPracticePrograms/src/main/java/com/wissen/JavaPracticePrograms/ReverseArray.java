package com.wissen.JavaPracticePrograms;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array= {1,4,6,2,9,3};
		int n=array.length;
		int[] rArray=new int[n];
		int b=n;
		
		for(int i=0;i<n;i++) {
			rArray[b-1]=array[i];
			b=b-1;
		}
		
		for(int k=0;k<n;k++) {
			System.out.println(rArray[k]);
		}
	}
}
