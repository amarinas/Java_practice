package intro;

import java.util.Arrays;

public class ReverseArray {
	public void reverseArr(int[] inputArray) {
		String copyArray = Arrays.toString(inputArray);
		int temp;
		for (int i = 0; i < inputArray.length/2; i++) {
			temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length - 1 - i];
			inputArray[inputArray.length - 1- i] = temp;
			
		}
		System.out.println("your current array is " + copyArray );
		System.out.println("your reverse array is " + Arrays.toString(inputArray));
	}
}
