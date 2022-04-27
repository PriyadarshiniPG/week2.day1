package week2.day1;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Anagram {
public static void main(String[] args) {
	String text1="stops";
	int txt = text1.length();
	String text2="potss";
	int txt1 = text2.length();
	if(txt==txt1) {
		char[] charArray = text1.toCharArray();
		System.out.println(charArray);
		char[] charArray2 = text2.toCharArray();
		System.out.println(charArray2);
		Arrays.sort(charArray);
		System.out.println(charArray);
		Arrays.sort(charArray2);
		System.out.println(charArray2);
		Arrays.equals(charArray, charArray2);
			System.out.println("this is anagram");
		
	}
	
}
}
