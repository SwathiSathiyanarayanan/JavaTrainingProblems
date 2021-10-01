package com.wissen.JavaPracticePrograms;

public class SortingArray {

	public static void main(String[] args) {
		int[] array= {3,6,2,-1,-4,-5,9,13,88,12,4,22,76};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println(array[i]);
			
		}
	}
}
