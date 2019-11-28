class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int a[]=new int[]{0,0};
        for(i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length ;j++)
                {
                if( nums[i]+nums[j] == target)
                {
                     a = new int[]{i,j};
                    return a;
                    
                }
                 }
        }
                            return a;
    }
    }