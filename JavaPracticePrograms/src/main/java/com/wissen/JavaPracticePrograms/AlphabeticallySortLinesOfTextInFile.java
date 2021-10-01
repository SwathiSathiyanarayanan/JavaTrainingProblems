package com.wissen.JavaPracticePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticallySortLinesOfTextInFile {

	public static void main(String[] args) throws IOException {
		
		String inputFile="";
		String outputFile="";
		
		FileReader fileReader=new FileReader(inputFile);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String inputLine;
		
		List<String> lineList=new ArrayList<String>();
		while((inputLine=bufferedReader.readLine())!=null) {
			lineList.add(inputLine);
		}
		fileReader.close();
		
		//Sort String on Ascending
		Collections.sort(lineList);
		
		//Sort String on Descending
		Collections.sort(lineList,Collections.reverseOrder());
		
		lineList.sort((s1,s2)->{ return s1.length()-s2.length();});
		System.out.println(lineList);
		
		FileWriter fileWriter = new FileWriter(outputFile);
		PrintWriter out=new PrintWriter(fileWriter);
		for(String outputLine:lineList) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();
		
		
	}
}
