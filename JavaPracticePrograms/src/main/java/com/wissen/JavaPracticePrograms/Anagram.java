package com.wissen.JavaPracticePrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="Keep".toLowerCase();
		String str2="Peek".toLowerCase();
		
		boolean isAnagram=checkAnagramOrNot(str1,str2);
		if(isAnagram)
			System.out.println("Its Anagram");
		else
			System.out.println("No its not Anagram");
	}

	private static boolean checkAnagramOrNot(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		Arrays.sort(str1.toCharArray());
		Arrays.sort(str2.toCharArray());
		
		if(str1.equals(str2)) {
			return true;
		}
		
		return false;
	}
}
