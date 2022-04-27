package week2.day1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FindTypes {
public static void main(String[] args) {
	String test = "$$ Welcome to 2nd Class of Automation $$ ";
	int  letter = 0, space = 0, num = 0, specialChar = 0;
	String[] split = test.split(" ");

//System.out.println(split.length);

//for(int i=0;i<split.length;i++) {
	//char[] charArray = split[i].toCharArray();
	char[] charArray = test.toCharArray();
for(int j=0;j<charArray.length;j++) {
	//System.out.println(charArray[j]);
	if(Character.isLetter(charArray[j])) {
		System.out.println(charArray[j]);
		//letter++;
		letter+=1;
	}
	else if (Character.isSpaceChar(charArray[j])) {
		space++;
		
	}
	else if(Character.isDigit(charArray[j])){
		num++;
		
	}
	else {
		specialChar++;
	}}


System.out.println("letter: " + letter);
System.out.println("space: " + space);
System.out.println("number: " + num);
System.out.println("specialCharcter: " + specialChar);}
}
