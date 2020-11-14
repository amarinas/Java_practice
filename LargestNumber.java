package intro;

public class LargestNumber {
	public int getLessThanN(int number, int digit) {
		//change into char
		char c = Integer.toString(digit).charAt(0);
		for (int i = number; i > 0; i--) {
			if(Integer.toString(i).indexOf(c) == -1)
			{
				return i;
			}
			}
		return -1;
	}
}
