package intro;

public class ReverseEachWord {
	public void reverseString(String inputString) {
		String [] words = inputString.split(" ");
		String reverseWord ="";
		
		for (int i = 0; i < words.length; i++) {
			String word =words[i];
			String reverseWords = "";
			for (int j = word.length() - 1; j >= 0;  j--) {
				reverseWords = reverseWords + word.charAt(j);
			}
			reverseWord = reverseWord +  reverseWords + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseWord);
	}
}
