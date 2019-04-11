import java.util.*;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> a = new ArrayList<List<Integer>>();
        Set<String> b = new HashSet<String>(); //To keep track of duplicates

        int index = 0; //position 0;
        int i = index+1; //This moves for every index position
        int j = i+1; //This is to check all indexes for index and i
        int check = 0;
        int sum = 0;

        while(i<nums.length-1)
        {
            if(check==1)
            {
                j=0;
                j=i+1;
                check=0;
            }

            sum = nums[index] + nums[i] + nums[j];
            String sumB ="[" + nums[index] + "," + nums[i] + "," + nums[j] + "]";

            if(sum==0 && !b.contains(sumB))
            {
                a.add(Arrays.asList(nums[index],nums[i],nums[j]));
                b.add(sumB);
            }

            if(j==nums.length-1)
            {
                check = 1;
                i++;
            }
            j++;
        }

     return a;
    }
}