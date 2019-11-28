class Solution {
    public int lengthOfLongestSubstring(String s) {
    char[] a = new char[s.length ()];
    a = s.toCharArray ();
    int prevCount = 0;
    int index = 0;
    ArrayList < Character > list = new ArrayList ();
    int count = 0;
    int i = 0;
        
    while ( i<a.length)
      {
	    char c = a[i++];
    	if (list.contains(c))
    	  {
	        i=index = list.lastIndexOf(c) + index+1;
	        list.clear();
	        count = 0;
    	  }
	    else
	      {
	        list.add(c);
	        count++;
	     }
	if (count > prevCount)
	  prevCount = count;	  
      }
    return (prevCount);
}}