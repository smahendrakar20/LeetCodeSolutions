class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        List<Integer> temp=new ArrayList();
        for(int i=0;i<nums1.length;i++)
        {
            temp.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++)
        {
            temp.add(nums2[i]);
        }
        
        Collections.sort(temp);
        //System.out.println( temp.size()%2==0 );
        if(temp.size()%2==0){
            return ( (float)(temp.get(temp.size()/2)+temp.get(temp.size()/2 - 1))/2  );
        }
        else
        {
            return ( temp.get(temp.size()/2));
        }	}
    }
