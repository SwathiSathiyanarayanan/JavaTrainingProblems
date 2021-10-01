package com.wissen.JavaPracticePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText {

	private static final String PATTERN ="\\d{10}";
	
	public static void main(String[] args) {
		List<String> values= new ArrayList<String>();
		values.add("Jai");
		values.add("12345345");
		values.add("1234567890");
		
		Pattern pattern=Pattern.compile("\\d{10}");
		for(String value :values) {
			Matcher matcher=pattern.matcher(value);
			System.out.println(matcher.matches());
		}
	}
}
