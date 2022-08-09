package SingleLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Main7 {
	public static Node reverseBetween(Node head, int m, int n)
    {
        int i = 1;
        Node temp = head;
        while(i <= m){
            head = head.next;
            i++;
        }
        Node startPoint = temp;
        while(i <= n){
            head = head.next;
            i++;
        }
        Node endPoint = temp;
        temp = startPoint;
        List<Integer> list = new ArrayList<>();
        while(temp != endPoint){
            list.add(temp.data);
            temp = temp.next;
        }
        List<Integer> newList = reverseList(list);
        temp = startPoint;
        int index = 0;
        while(temp != endPoint){
            temp.data = newList.get(index);
            temp = temp.next;
            index++;
        }
        return head;
    }
    
    public static List<Integer> reverseList(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        int index = list.size() - 1;
        while(index >= 0){
            newList.add(list.get(index));
            index--;
        }
        return newList;
    }
}
