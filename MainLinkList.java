

public class MainLinkList {
    

    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.add(11);// add=>add node at end of linklist
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.append(10);// add Node at head or starting point in link list
        list.append(9);
        list.print();// print whole linklist
        System.out.println();
        System.out.println("length:-" + list.length());// give length of linklist
        System.out.println("removed node:-" + list.removefirst());// remove head node
        list.print();
        System.out.println();
        System.out.println("removed node:-" + list.removelast());// rempve tail node
        list.print();
        list.reverse();// reverse the whole linklist
        System.out.println();
        System.out.println("reversed linklist:-");
        list.print();
        System.out.println();
        System.out.println(list.isEmpty());// check link list is empty or not
        list.deleteNode(2); // delete node number 2
        list.removeNode(12);// remove node which has value 12
        list.print();
        list.deleteMidNode();// delete middle node
        System.out.println();
        list.print();
        list.deleteList();// delete whole link list
        System.out.println();
        list.print();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);
        list.append(2);
        list.append(1);
        System.out.println();
        list.print();
        System.out.println();
        System.out.println(list.searchnode(list.head, 1));// search the with given node value
        System.out.println(list.getNode(6));// get the nth node from start
        System.out.println(list.getNodeend(2));// get the nth node from end
        System.out.println(list.getmiddleNode().val);// get middlenode
        list.add(2);
        list.print();
        System.out.println();
        System.out.println(list.getfrequency(list.head, 2));// get frequency given node val
        list.deleteList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.head.next.next.next.next = list.head.next; /// creating loop

        System.out.println(list.detectloop());// chek given linklist have any loop or not
        System.out.println(list.loopNodes());// if given linklist have any loop gives number of nodes in loop
        list.deleteList();

        list.add(1);
        list.add(1);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        System.out.println(list.pallindrome());
        list.removeduplicates();
        list.print();
        // list.swap(1,4);
       // System.out.println();
       // list.print();
        list.swapinpair();
        System.out.println();
        list.print();
        list.movefront();
        System.out.println();
        list.print();
        // MyLinkList list2 = new MyLinkList();
        // list2.add(1);
        // list2.add(3);
        // list2.add(5);
        // list2.add(6);
        // list2.print();   
    }
}