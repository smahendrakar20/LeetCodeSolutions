import java.util.Stack;


  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headFinal=head;
        Stack<ListNode> st=new Stack();
        Stack<ListNode> st2=new Stack();

        int count=0;

        if(head==null)
        {
            return null;
        }


        while(head!=null)
        {
            count++;
            st.push(head);
            head=head.next;
        }
        if(count==n){
            return headFinal.next;
        }
        if(n==1){
            if(headFinal.next==null){
                return null;
            }
            st.pop();
            st.peek().next=null;
            return headFinal;
        }

        ListNode temp=null;
        while(n!=1)
        {
            temp=st.pop();
            //   System.out.println(temp.val);

            n--;
        }

        st.pop();

        st.peek().next=temp;

        return headFinal;

    }
}