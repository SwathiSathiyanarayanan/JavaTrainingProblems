package com.wissen.JavaPracticePrograms;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String r="";
		for(int i=s.length();i>0;i--) {
			r=r+s.charAt(i-1);
		}
		if(s.equals(r)) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
