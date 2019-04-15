class longPalindrome {
public String longestPalindrome(String s) {
    
        //General approach:Process each character in string, on each character(say i=0)
        //look for the same character in the loop and when you find it send that to
        //the method that checks if its a palindrom (note:make sure you save word as
        //string before checking if its a palindrome)
        
        String word = "";
        String pWord = "";
        
        if(s.length()==1)return s;
        if(s.length()==2)
        {
            String d ="" + s.charAt(0);
            if(s.charAt(0)==s.charAt(1))return s;
            
            else return d;
        }
        
        boolean check2 = false;
        for(int i=0;i<s.length(); i++)
        {
            for(int j=s.length();i+1!=j; j--)
            {
                if(i!=j)
                {
                     String wr = s.substring(i,j) ;
                    //System.out.println(wr + "," + j);
                    boolean check = pal(wr);
                    if(check==true)
                    {
                     pWord = wr;   
                        check2 = true;
                     //return pWord;
                    }                    
                }
            }
            if(i==s.length()-1)
            {
                if(check2==true)
                {}
            }
        }
        
        if(check2==false)
        {
            String d ="" + s.charAt(0);
            return d;            
        }
        
        if(check2==true)
        {
            return pWord;            
        }
        
        /*
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
                 // word = word + s.charAt(j);
                  boolean check = pal(word); //send the word to palindrome; 
                  if(check==true)pWord = word;
                }
            }
            word = "";
        }
        return pWord;
        */
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
