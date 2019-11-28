
class Solution {
    public ListNode swapPairs(ListNode head) {
                ListNode headFinal= head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        if(head.next!=null){
            headFinal=head.next;
        }

        Queue<ListNode> st = new LinkedList();
        while(head!=null){
            st.add(head);
            head=head.next;
        }
        boolean dontStop=true;
        int count=0;
        ListNode nextNode=null;
        ListNode previous=null;
        ListNode bottom=null;
        
        while(dontStop){
                ListNode top=st.poll();
                if(count==0){
                previous=top;
                }
            if(st.peek()==null){
                top.next=null;
                previous.next=top;
                return headFinal;
            }
                bottom=st.poll();
                bottom.next=top;
            
            if(count>0){
                previous.next=bottom;
                previous=top;
            }
            
            if(st.peek()==null){
                top.next=null;
                dontStop=false;
            }
            count++;
              
        }

        return headFinal;
        
    }
}