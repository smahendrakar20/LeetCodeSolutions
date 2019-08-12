import java.util.ArrayList;
import java.util.List;

public class End {
    public List<String> generateParenthesis(int n) {
        List<String> param=new ArrayList<>();
        List<String> finalAns=new ArrayList<>();
        for (int x=0;x<n;x++){
            param.add("(");
            param.add(")");
        }

        for(String zz:param){
           for(String aa:finalAns){
               finalAns.add(aa+zz);
           }
        }
        for(String a:finalAns){
            System.out.println(a);
        }
        return finalAns;
    }

    public static void main(String[] args) {
        End sol=new End();
        List<String> list=sol.generateParenthesis(3);

        for(String a:list){
            System.out.println(a);
        }
    }
}
