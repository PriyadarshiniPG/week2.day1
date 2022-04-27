package week2.day1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Palindrome {
	public static void main(String[] args) {
	String value = "madam";
		String rev = "";
		char[] Array = value.toCharArray();

		for (int i = Array.length - 1; i >= 0; i--) {
			//we add rev inorder to verify each and every letter example 
			//m false
			//mafalse... if iadd "" rather than rev then i will not be getting the whole word it will compare only each character with the value" madam"
			
			rev = rev+ Array[i];
			System.out.print(rev);
			System.out.println(rev.equalsIgnoreCase(value));
			if (rev.equalsIgnoreCase(value)) {
				System.out.println("This is palindrome " );

			}
		}
	}
}
