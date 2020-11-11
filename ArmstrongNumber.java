package intro;

public class ArmstrongNumber {
	public void armstrong(int number){
		int sum = 0, temp = number;
		while(number > 0) {
			int rem = number % 10;
			sum += (rem * rem * rem);
			number = number / 10;
		}
		if(temp == sum) {
			System.out.println( temp  + " is Armstrong number");
		}else {
			System.out.println( temp  + " is not Armstrong number");
		}
		
	}
}
