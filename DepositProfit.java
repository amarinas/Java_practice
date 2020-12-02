package intro;

public class DepositProfit {
	 public static int depositReturn(int inputDeposit, int inputRate, int inputThreshold) {
		int years =0;
		int total = inputDeposit;
		
		while(total < inputThreshold) {
			years ++;
			total += total * (inputRate / 100);
		}
		System.out.println(years);
		return years;
	}


}
