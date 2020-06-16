
public class random {
    public static void main(String[] args){

        String [] words = {"apple", "pear", "this", "cat"}; 


        String[] mixedWords = new String[words.length]; 
	    for( int i = 0; i < words.length - 1 ; i++)
	    {
		    String a = words[i]; 
            String b = words[i + 1]; 
            
            
            String c = recombine(a,b); 
		    String d = recombine(b,a); 

		    mixedWords[i] = c; 
		    mixedWords[i+1] = d; 

		    
        }   
        
        for(int x = 0; x < mixedWords.length; x++)
        {
            System.out.println(mixedWords[x]); 
        }


        
    }

    public static String recombine(String word1, String word2){
        {
            String a = ""; 
            String b = ""; 
            if(word1.length() % 2 == 1	&& 	word2.length() % 2  == 0) 
            {
                a = word1.substring(0,word1.length() / 2);
                b = word2.substring(word2.length() / 2, word2.length()); 
                return a + b;
            }
            if(word1.length() % 2 == 0	&& 	word2.length() % 2  == 1) 
            {
                a = word1.substring(0,word1.length() / 2);
                b = word2.substring(word2.length() / 2, word2.length()); 
                return a + b;
            }
            else
            {
                a = word1.substring(0,word1.length() / 2);
                b = word2.substring(word2.length() / 2, word2.length()); 
                return a + b;
            }
        }
        
    }
}