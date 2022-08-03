package SingleLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Quick sort on Double Linked List
class Node{
	Node next;
	int data;
}
public class Main4 {
	public static Node partition(Node l, Node h)
    {
        List<Integer> list = new ArrayList<>();
        Node temp = l;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = l;
        int i = 0;
        while(temp != null){
            temp.data = list.get(i);
            i++;
            temp = temp.next;
        }
        return l;
    }
}
