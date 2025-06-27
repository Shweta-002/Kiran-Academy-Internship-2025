package string_seperation;

public class StringSeperation {

	String name;
	StringBuilder alphabates=new StringBuilder();
	StringBuilder numbers=new StringBuilder();
	StringBuilder specialCharacter=new StringBuilder();

	public StringSeperation(String name) {
		this.name = name;
	}
	
	public void stringSeperation() {
		
		char ch [] = name.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(Character.isLetter(ch[i])) {
				alphabates.append(ch[i]);
			}else if(Character.isDigit(ch [i])) {
				numbers.append(ch [i]);
			}else {
				specialCharacter.append(ch [i]);
			}
		}
		System.out.println("Alphabates: " + alphabates);
		System.out.println("Digits: " + numbers );
		System.out.println("Special Characters: " + specialCharacter);
		
		
	}
	
}
