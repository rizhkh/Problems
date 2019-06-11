class Solution {
    public String findLongestWord(String s, List<String> d) {

        Set<Character> a = new HashSet<Character>();

        for(int i=0;i<s.length(); i++)
        {
            if(!a.contains(s.charAt(i)))a.add(s.charAt(i));
        }

        //for(String st:List<String>d)
        String retname = "";
        int k=0;

        if(d.size()!=0)
        {
         retname = d.get(0);
            k = d.get(0).length();
        }
        int l = 0;


        if(d.size()!=0)
        for(int i=0;i<d.size(); i++)
        {
            String sname = d.get(i);
            l = retLen(sname,a);
            if(l!=-1)
            {
                if(l>k)
                {
                    retname=sname;
                }
            }
            if(l>k)k = l;
        }

        return retname;

    }

    public int retLen(String s,Set<Character> a)
    {
        int len = 0;
        //Set<Character> b = new HashSet<Character>();


        for(int i=0; i<s.length(); i++)
        {
            if( a.contains(s.charAt(i)) ){}

            else
            {return -1;}
        }

        return s.length();
    }

}