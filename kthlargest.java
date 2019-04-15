class kthlargest {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int temp = nums[nums.length-1];
        int counter=1;

        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<=temp)temp = nums[i];

            if(counter==k)break;

            counter++;
        }

        return temp;
    }
}