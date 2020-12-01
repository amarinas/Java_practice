package intro;

public class NumberOrString {
	static boolean numberOrNot(String input) {
		try {
			Integer.parseInt(input);
		} catch ( NumberFormatException ex) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
}
