class Solution {
    public List<Integer> findDuplicates(int[] nums) {
https://leetcode.com/problems/find-all-duplicates-in-an-array/

        //Keep adding numbers to hashmap, if you find a duplicate add that to the list

        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
        List<Integer> b = new ArrayList<Integer>();

        for(int i=0;i<nums.length; i++)
        {
            if(!a.containsKey(nums[i]))a.put(nums[i],1);
            else
            {
                int sum = a.get(nums[i]);
                b.add(nums[i]);
                //a.put(nums[i],sum++);
            }
        }
        /*
        for(Map.Entry<Integer,Integer> c : a.entrySet())
        {
            int n = c.getValue();
            if(n>1)
            {
                b.add(c.getKey());
                System.out.println(c.getKey());
            }
        }
        */
        return b;

    }
}