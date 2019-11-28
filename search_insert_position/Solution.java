class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = search(nums,0,nums.length-1,target);
        return ans;
    }
    public int search(int[] nums,int start,int last,int target)
    {        
        int mid = (start+last)/2;
        
        if(start!=last){
            if(target>nums[mid])
                return search(nums,mid+1,last,target);
            else if(target<nums[mid]){
                if (mid-1<start) return mid;
                else return search(nums,start,mid-1,target);}
            else if(target==nums[mid])
                return mid;
        }
        else if(start==last)
            {
                if(target==nums[mid])
                    return start;
                if(target>nums[mid])
                    return start+1;
                if(target<nums[mid])
                    return mid;
            }
        return 0;
    }
}