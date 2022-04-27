package week2.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";

		String[] split = test.split(" ");
		String rev = " ";
//System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			// System.out.println(i);
			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {

					rev = rev + charArray[j];
					// System.out.println("this is rev "+" "+rev);

				}
				System.out.print(rev + " ");
			} else {

				{

					System.out.print( split[i]);

				}

			}
		}
	}
}
