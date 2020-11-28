package intro;

public class ReverseAddPalindrome {
	//method to reverse number
	static int reverseNumber(int number) {
		int reverse = 0;
		int rem = 0;
		while(number != 0) {
			rem = number % 10;
			reverse = (reverse * 10) + rem;
			number = number/10;
		}
		return reverse;
	}
	
	//Method to check for Palindrome
	static boolean checkPalindrome(int number) {
		int reverse = reverseNumber(number);
		if (reverse == number) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//reverse and add given number until you get a palindrome
	static void reverseAdd(int number) {
		if(checkPalindrome(number)) {
			System.out.println( number + " is already a palindrome");
		}else {
			while(!checkPalindrome(number)) {
				int reverse = reverseNumber(number);
				int sum = number + reverse;
				System.out.println(number + "+" +reverse+"="+sum);
				number = sum;
			}
		}
	}
}
