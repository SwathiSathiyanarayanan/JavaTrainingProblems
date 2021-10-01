package com.wissen.JavaPracticePrograms;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] array= {1,4,2,7,22,9};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println(array[array.length-1]);
//		for(int n:array) {
//			System.out.println(n);
//		}
	}
}
