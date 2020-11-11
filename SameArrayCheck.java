package intro;

public class SameArrayCheck {
	public void checkArray(int [] input1, int [] input2) {
		boolean same = true;
		if (input1.length == input2.length) {
			for(int i =0; i < input1.length; i ++) {
				if(input1[i] != input2[i]) {
					same = false;
				}
			}
		}else {
			same = false;
		}
		if(same) {
			System.out.println("Two Array are equal");
		}else {
			System.out.println("Two array are not equal");
		}
	}
}
