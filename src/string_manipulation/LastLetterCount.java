package string_manipulation;

public class LastLetterCount {
	
	public LastLetterCount(String string) {
        
		int count=0;  
        int index1 = 0;
        int index2 = 0;
        String sub1 = null;
        String sub2 = null;
        
        char ch[]= new char[string.length()];     
        
        for( int i=0; i < string.length(); i++)  {  
            ch[i]= string.charAt(i);  
            if (ch[i] == 'y') {
            	index1 = i;
            	sub1 = string.substring(0,index1+1);
            }
            else if (ch[i] == 's') { 
            	index2 = i;
            	sub2 = string.substring(index1+1, index2+1);
            }
        }
        System.out.println("Swapped string: "+sub2 + " " + sub1);
	}
}
