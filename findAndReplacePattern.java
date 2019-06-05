import java.util.*;
class findAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        //abb - 011
        //mee - 011
        //first  id the pattern e.g abb->011 or abc->012
        //then id each word and then compare the pattern id's
        //e.g abb ->011 and mee->011

        HashMap<Character,Integer> id = new HashMap<Character,Integer>(); // To store ID
        List<String> b = new ArrayList<String>();

        String p = getId(pattern,id);
        id.clear();
        for(int i=0;i<words.length; i++)
        {
            String ig = getId(words[i],id);
            if(ig.equals(p))
            {
                    b.add(words[i]);
            }

            id.clear();
        }

        return b;
    }

    public String getId(String w,HashMap<Character,Integer> id)
    {
        int num = 0;String ret = "";
        for(int i=0;i<w.length(); i++)
        {
            if(!id.containsKey(w.charAt(i)))
            {
                id.put(w.charAt(i),num);
                ret = ret + num;
                num++;
            }
            else
            {
                int num2 = id.get( w.charAt(i) );
                ret = ret + num2;
            }
        }
        return ret;
    }


}