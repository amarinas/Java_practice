package intro;

public class BubbleSort {
	public void sort(int[] arr) {
//		boolean isSorted;
		for(int i = 0; i < arr.length; i++) {
//			isSorted = true;
			for (int j = 1; j < arr.length ; j++) {
				if (arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
//					isSorted = false;
				}
//			if(isSorted) {
//				return;
//			}
			}
		}
	}
	
	
	private void swap(int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		}
	


}