package intro;

public class SumAllDigits {
	public void sumDigits(int inputNumber) {
		int sum = 0;
		int number = inputNumber;
		while(number != 0) {
			int last = number%10;
			sum = sum + last;
			number = number/10;
		}
		System.out.println(sum);
	}
}
