import java.util.HashSet;
import java.util.Stack;

public class MyLinkList{
    Node head;
    void add(int data){
        Node toadd=new Node(data);
        if(isEmpty()){
            head=toadd;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toadd;
        return ;
    }
    boolean isEmpty(){
        return head==null;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    void append(int data){
        Node toadd=new Node(data);
        if(isEmpty()){
            head=toadd;
            return;
        }
      
        toadd.next=head;
        head=toadd;
    }
    int removefirst(){
        Node temp=head;
        if(head==null )
        return -1;

        head=head.next;
        return temp.val;
    }
    int removelast(){
        if(head==null)
        return -1;
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
        temp=temp.next;
        }
        Node temp1=temp;
        prev.next=temp.next;

        return temp1.val;
    }
    void reverse(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }
    Node search(int k){
        Node curr=head;
        while(curr!=null){
            if(curr.val==k)
            {
                break;
            }
            curr=curr.next;
        }
        return curr;
    }
    void removeNode(int k){
        Node temp=search(k);
        if(temp!=null && temp.next!=null)
       {
        temp.val=temp.next.val;
        temp.next=temp.next.next;
       }
    }

    boolean searchnode(Node head,int k){
        if(head==null)
        return false;

        // Node curr=head;
        // while(curr!=null){
        //     if(curr.val==k)
        //     {
        //         return true;
        //        // break;
        //     }
        //     curr=curr.next;
        // }
        // return false;
        if(head.val==k)
        return true;

        return searchnode(head.next,k);

    }
    void deleteNode(int x){
        int len=length();
       
        if(x>len)return;
        if(x==1)head=head.next;

        else{
            Node prev=null;
            Node curr=head;
            for(int i=1;i<x;i++){
                prev=curr;
                curr=curr.next;
            }
            prev.next=curr.next;
        }
    }
    int getlenrec(Node head){
        if(head==null)
        return 0;
        return 1+getlenrec(head.next);
    }
    int  length(){
        // int len=0;
        // Node temp=head;
        // while(temp!=null){
        //     len++;
        //     temp=temp.next;
        // }
        int len=getlenrec(head);
        return len;
    }
    Node getmiddleNode(){
        Node fast=head;
        Node slow=head;

        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    void deleteMidNode(){
      
        Node slow=getmiddleNode();
        slow.val=slow.next.val;
        slow.next=slow.next.next;
        
    }
    void deleteList(){
        head=null;
    }
   int getNode(int k){
       Node temp=head;
       while(k-->1){
           temp=temp.next;
       }
       return temp.val;
   }
   int getNodeend(int k){
    int len=length();
    if(k>len)
    return -1;
    if(k==1)
    return head.val;
        Node temp=head;
        for(int i=0;i<len-k;i++){
            temp=temp.next;
        }
        return temp.val;
   }
    int getfrequency(Node node, int search)
    {
        int count = 0;
        Node temp = node;
        
        while(temp != null)
        {
            if(temp.val == search)
              count++;
              
            temp = temp.next;
        }
        
        return count;
    }
    boolean detectloop(){
        Node temp=head;
        HashSet<Node>set=new HashSet<>();
        while(temp!=null){
            if(set.contains(temp))
            return true;

            set.add(temp);
            temp=temp.next;
        }
        // Node slow_p = head, fast_p = head;
        // int flag = 0;
        // while (slow_p != null && fast_p != null && fast_p.next != null) {
        //     slow_p = slow_p.next;
        //     fast_p = fast_p.next.next;
        //     if (slow_p == fast_p) {
        //         flag = 1;
        //         break;
        //     }
        // }
        return false;
    }

    int countNodes(Node node){
        int res=2;
        Node temp=node;
        while(temp.next!=node){
            res++;
            temp=temp.next;
        }
        return res;
    }
    int loopNodes(){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
             return countNodes(slow);
            }
        }
        return 0;
    }
    boolean pallindrome(){
        if(head==null)
        return false;
        if(head.next==null)
        return true;//valid for input(0-9);
        Node temp=head;
        Stack<Integer>stack=new Stack<>();
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        int len=length();
        Node temp1=head;
        int count=0;
        while(temp1!=null && !stack.isEmpty()){
            int i=stack.pop();
            if(temp1.val==i)
            count++;

            temp1=temp1.next;
        }
        if(count==len)
        return true;
        
        return false;
    }
    void removeduplicates(){
        // Node curr=head;
        // while(curr!=null){
        //     Node temp=curr;
        //     while(temp!=null && temp.val==curr.val){
        //         temp=temp.next;
        //     }
        //     curr.next=temp;
        //     curr=curr.next;
        // }
        Node ptr1 = head, ptr2 = null;
       // Node dup = null; 
        
        while (ptr1 != null && ptr1.next != null) { 
            ptr2 = ptr1; 
        while (ptr2.next != null) { 
              if (ptr1.val == ptr2.next.val) { 
                   // dup = ptr2.next; 
                    ptr2.next = ptr2.next.next; 
                //    System.gc(); 
                } else  { 
                    ptr2 = ptr2.next; 
                } 
            } 
            ptr1 = ptr1.next; 
        } 
    }
    
    void movefront(){
        if(head==null || head.next==null)
        return;

        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        
        prev.next=null;
        temp.next=head;

        head=temp;
    }
    void printnodes(Node node){
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
    }

    void swapinpair(){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            int k=temp.val;
            temp.val=temp.next.val;
            temp.next.val=k;
            temp=temp.next.next;
        }
    }
    
   public static class Node{
        Node next;
        int val;
        
        public Node(int val){
            this.val=val;
            next=null;
        }
    } 

}