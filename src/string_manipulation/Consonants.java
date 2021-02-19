package string_manipulation;

public class Consonants {

	public Consonants(String sentence) {
		int count = 0;
	    for (int i=0 ; i<sentence.length(); i++){
	       char ch = sentence.charAt(i);
	       char s = '*';
	       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
	          System.out.print("");
	          sentence.replace(sentence.charAt(i), s);
	          
	       }else if(ch != ' '){
	          count++;
	       }
	    }
	    System.out.println("Number of consonants in the given sentence is "+count);	
	}
}
