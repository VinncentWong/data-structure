package SingleLinkedList;

public class Main11 {

}

//function should insert a new node in sorted way in
//a sorted doubly linked list
class GfG
{
 public static Node sortedInsert(Node head, int x)
 {
     Node before = head;
     Node temp = head;
     Node newNode = new Node(x);
     while(x > temp.data){
         before = temp;
         temp = temp.next;
     }
     before.next = newNode;
     newNode.prev = before;
     newNode.next = temp;
     temp.prev = newNode;
     return head;
 }
}

class Node{
	Node prev;
	Node next;
	int data;
	Node(int data){
		this.data = data;
	}
}