package intro;

public class CountVowelConsonant {
	static int countVowel(String[] inputString) {
		int vCount =0, cCount= 0;
		String vowels = "aeiou";
		for (int i = 0; i < inputString.length; i++) {
			if(vowels.contains(inputString[i])) {
				vCount ++;
			}else {
				cCount += 2;
			}
		}
		return vCount + cCount;
	}
}
