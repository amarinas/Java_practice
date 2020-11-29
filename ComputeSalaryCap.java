package intro;

import java.util.Arrays;

//Return salary cap with salaries and budget provided
public class ComputeSalaryCap {
	public int comSalaryCap(int[] salaries, int budget) {
		int index = salaries.length;
		Arrays.sort(salaries);
//		System.out.println(Arrays.toString(salaries));
		
		while(index > 0) {
			int total =0;
			
			for (int i = 0; i < index; i++) {
				total += salaries[i];
//				
			}
			System.out.println(total);
			int k = budget - total;
			System.out.println("k value is "+ k);
			//check if k is greater than or equal to the rest of the numbers
			if(k >= salaries[index-1]) {
				int endPosition = salaries.length - index;
				return k / endPosition;
			}
			index --;
			
		}
		return budget / salaries.length;
		
	}
}
 