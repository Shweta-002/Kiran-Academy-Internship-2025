package string_seperation_count;

public class StringCount {

	String series;
	int countLetter = 0;
	int countDigit = 0;
	int countSpecialCharacter = 0;

	public StringCount(String series) {
		this.series = series;
	}

	public void countString() {
		char[] c = series.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (Character.isLetter(c[i])) {
				countLetter++;
			} else if (Character.isDigit(c[i])) {
				countDigit++;
			} else {
				countSpecialCharacter++;
			}
		}

		System.out.println("Count of Letters: " + countLetter);
		System.out.println("Coount of Digits: " + countDigit);
		System.out.println("Count of Special Characters: " + countSpecialCharacter);
	}

}
