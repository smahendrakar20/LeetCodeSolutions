class Solution {
    public int removeDuplicates(int[] nums) {
        
        int previous=0;
        int count=nums.length;
        
        if(nums.length==0 || nums.length==1)
            return nums.length;
        
        for(int i=0;i<nums.length;i++){
            if(i==0)
            {
                previous=nums[i];
                continue;
            }
            else{
                if(previous==nums[i]){               
                    previous=nums[i];
                    for(int zz=i;zz<nums.length-1;zz++)
                     nums[zz]=nums[zz+1];
                  count--;
                }
            }
            
        }
        return count;
    }
}