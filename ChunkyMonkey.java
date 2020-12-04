package intro;

import java.util.Stack;

public class ChunkyMonkey {
	static Stack<int[]> chunky(int[] arr, int size) {
		
		int count = 0;
		int[] slice = new int[count + size - count];
		Stack<int[]> st = new Stack<int[]>();
		for (int i = 0; i < arr.length/size; i++) {
			st.push(slice);
			count += size;
		}
		return st;
	}
}
//need to verify