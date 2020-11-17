package intro;

import java.util.Arrays;

public class SeperateZeros {
	public void seperateNumbers(int[] inputNumber) {
		int counter = 0;
		for (int i = 0; i < inputNumber.length; i++) {
			if (inputNumber[i] != 0) {
				inputNumber[counter] = inputNumber[i];
				counter++;
			}
		}
		while (counter < inputNumber.length) {
			inputNumber[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputNumber));
	}
}
