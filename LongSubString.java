class LongSubString {
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> mapper = new HashSet<Character>();
        
        //General algorithmic approach: On each character,add it to set,and associate it to a number
        // the next different number would have a different character,if a character repeats itself then
        // the clear the set and start the sum from 1 again
        if(s.length()==0)return 0;
        if(s.length()==1)return 1;
        
        char lastChar = s.charAt(0);
        mapper.add(s.charAt(0));
        int sum = 1 ; //This would keep track of the numbers
        int temp = 0 ;
        for(int i=1;i<s.length(); i++)
        {

            if(lastChar==s.charAt(i))
            {
                mapper.clear();
                mapper.add(s.charAt(i)); 
                temp = sum;
                sum=1;
            }
            if(lastChar!=s.charAt(i))
            {
            
                if(mapper.contains(s.charAt(i))) {
                    temp =sum;}                
                
                if(!mapper.contains(s.charAt(i)))
                {
                    mapper.add(s.charAt(i)); 
                    sum++;  
                    temp = sum;
                }
            }
            
            lastChar = s.charAt(i);
        }        
        
        return temp;
    }
}