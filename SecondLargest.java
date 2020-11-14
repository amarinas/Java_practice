package intro;

public class SecondLargest {
	public void secondLargestNumber(int[] array) {
		int first, second;
		if(array[0] > array[1]) {
			first = array[0];
			second = array[1];
		}
		else {
			{
				first = array[1];
				second = array[0];
			}
		for (int i = 2; i < array.length; i++) {
			if (array[i] > first) {
				second = first;
				first = array[i];
			}else if (array[i] < first && array[i] > second) {
				second = array[i];
			}
		}
		System.out.println(second);
		}
		
		
	}
}
