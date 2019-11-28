
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;

public class Solution {
    public List<String> letterCombinations(String digits) {

        HashMap<Integer,String> map=new HashMap();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        List<String> finalAns=new ArrayList<>();
        String first=map.get( Integer.parseInt(String.valueOf(digits.charAt(0))) );
        for(int x=0;x<first.length();x++)
        {
            finalAns.add( Character.toString( first.charAt(x) ));
        }
        if(digits.length()>1){

        for(int x=1;x<digits.length();x++)
        {
            List<String> temp=new ArrayList<>();
            int num=Integer.parseInt(String.valueOf(digits.charAt(x)));
            String nextStr=map.get(num);
            for(String s:finalAns){

                for(int zz=0;zz<nextStr.length();zz++) {
                    String tempo = s + nextStr.charAt(zz);
                    temp.add(tempo);
                }
            }

            finalAns=temp;

        }

        }



        return finalAns;
    }
    public static void main(String[] args) {

        Solution sc=new Solution();
        List<String> list=sc.letterCombinations("234");
        for(String x: list)
            System.out.println(x);
    }

}
