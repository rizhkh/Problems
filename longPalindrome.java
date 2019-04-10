class longPalindrome {
    public String longestPalindrome(String s) {
    
        //General approach:Process each character in string, on each character(say i=0)
        //look for the same character in the loop and when you find it send that to
        //the method that checks if its a palindrom (note:make sure you save word as
        //string before checking if its a palindrome)
        
        String word = "";
        String pWord = "";
        for(int i=0;i<s.length(); i++)
        {
            word = word + s.charAt(i);
            if(i!=s.length()-1)
            for(int j=i+1;j<s.length(); j++)
            {
                word = word + s.charAt(j);
                
                if(j!=s.length()-1)
                if(s.charAt(i)==s.charAt(j) && s.charAt(i)==s.charAt(j+1))
                {
                  word = word + s.charAt(j);
                  boolean check = pal(word); //send the word to palindrome; 
                  if(check==true)pWord = word;
                }                
                
                if(s.charAt(i)==s.charAt(j))
                {
                  boolean check = pal(word); //send the word to palindrome; 
                  if(check==true)pWord = word;
                }
            }
            word = "";
        }
        return pWord;
    }
    
    public boolean pal(String a)
    {
        int j = a.length()-1;
        for(int i=0;i<a.length(); i++)
        {
            if(i==j & a.charAt(i)==a.charAt(j))
            {
                return true;
            }
            
            if(a.charAt(i)==a.charAt(j))
            {}
            
            else return false;
                
            j--;
        }
        return true;
    }
        
    
}