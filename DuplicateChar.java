package intro;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {
	public void duplicateCount(String inputString) {
		//create hashmap cointain char as key and value is occurance
		HashMap<Character, Integer> charCountMap= new HashMap<Character, Integer>(); 
		
		//change imput to char array
		char[] strArray = inputString.toCharArray();
		
		//loop through the array
		for (char c : strArray) {
			if(charCountMap.containsKey(c)) {
				//if char is present increase amount
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else {
				charCountMap.put(c, 1);
			}	
		}
		Set<Character> charInString = charCountMap.keySet();
		System.out.println("Duplicate Characters " + inputString );
		
		//loop through set
		for (Character ch : charInString) {
			if(charCountMap.get(ch)> 1) {
				System.out.println(ch + " : "+ charCountMap.get(ch));
			}
		}
	}
}
