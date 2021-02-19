package string_manipulation;

public class Palindrome {

	public Palindrome(String origString) {
        int length = origString.length();
		
		for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                return;
            }
        }
		System.out.println("String is a palindrome");
	}
}
