package intro;

public class WhatIsTheRomanNumber {
	public void romanSymbols(int inputNumber) {
		String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String roman = "";
		int copyNumber = inputNumber;
		if(inputNumber >=1 && inputNumber <= 3999) {
			for (int i = 0; i < 13; i++) {
				while(inputNumber >= decimals[i]) {
					inputNumber = inputNumber - decimals[i];
					roman = roman + symbols[i];
				}
			}
			System.out.println("Roman number Symbols for " + copyNumber+ " is " + roman);
		}else {
			System.out.println("Please enter number between 1 and 3999");
		}
	}
}
