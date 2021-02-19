package string_manipulation;

public class Vowels {

	int count = 0;
	
	public Vowels(String sentence) {
		
		for (int i=0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				this.count++;				
			}			
		}
		System.out.println("number of vowels in the sentence is: " + this.count);
		return;
	}	
}
