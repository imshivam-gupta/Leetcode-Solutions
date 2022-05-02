/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null){
            return list2; 
        }
        
        if(list2==null){
            return list1;
        }
        
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode temp=null;
        ListNode ans=null;
        
        if(list1.val<list2.val)
        {
            ans=list1;
            temp=ans;
            temp1=list1.next;
        }
        
         else 
        {
            ans=list2;
            temp=ans;
            temp2=list2.next;
        }
        
        
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;
            }
            
            else
            {
                temp.next=temp2;
                temp2=temp2.next;
                temp=temp.next;
            }
            
        }
        
              if(temp1==null)
            temp.next=temp2;
        
        else if(temp2==null)
            temp.next=temp1;
        
    
    return ans;
    }
}
   
        
        
    
    
