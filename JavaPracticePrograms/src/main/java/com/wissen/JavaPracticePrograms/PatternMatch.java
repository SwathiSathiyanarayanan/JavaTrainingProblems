package com.wissen.JavaPracticePrograms;

import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		String str="Today is Good Day";
		
		boolean matches=Pattern.matches(".*is.*", str);
		System.out.println("Result"+matches);
	}
}
