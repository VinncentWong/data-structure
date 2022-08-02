package SingleLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Compare 2 Linked List - Hackerrank
public class Main3 {
	public static void main(String[] args) {
		
	}
}

class Solution{
	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while(temp1 != null){
            list1.add(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            list2.add(temp2.data);
            temp2 = temp2.next;
        }
        if(list1.size() != list2.size()){
            return false;
        } else {
            Iterator<Integer> iterator1 = list1.iterator();
            Iterator<Integer> iterator2 = list2.iterator();
            while(iterator1.hasNext() && iterator2.hasNext()){
                if(iterator1.next() != iterator2.next()){
                    return false;
                }
            }
            return true;
        }
    }
}
