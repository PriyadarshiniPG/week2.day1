package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			//Reason for using split is to sepeerate each string reason to use tochar array is split each and every character 
			char[] charArray = split[i].toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				// System.out.println(charArray[j]);
				if (charArray[j] == 'e') {
					// System.out.println(charArray[j]);
					count++;
				}

			}

		}
		System.out.println("Number of times e occurs" + " " + count);
	}
}
