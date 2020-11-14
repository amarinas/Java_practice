package intro;

import java.util.ArrayList;

public class MergeArray {
	 public void mergeArr(int[] array1, int [] array2 ) {
		int p1 = 0, p2 =0;
		
		//empty array
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(p1 < array1.length && p2 < array2.length ) {
			if(array1[p1] < array2[p2]) {
				result.add(array1[p1]);
				p1++;
			} else if(array1[p1] >= array2[p2]) {
				result.add(array2[p2]);
				p2++;
			}
		}
		if(p1 < array1.length) {
			while(p1 < array1.length) {
				result.add(array1[p1]);
				p1++;
			}
		}
		if(p2 < array2.length) {
			while(p2 < array2.length) {
				result.add(array2[p2]);
				p2++;
			}
		}
		System.out.println(result);
	}
	
	
	 void printResult(ArrayList<Integer> result) {
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i) + " ");
		}
	}
	
}
