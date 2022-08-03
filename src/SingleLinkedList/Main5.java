package SingleLinkedList;

// Linked list length is even or odd
public class Main5 {
	int isLengthEvenorOdd(Node head1)
	{
	    int size = 0;
	    while(head1 != null){
	        head1 = head1.next;
	        size++;
	    }
	    if(size % 2 == 0){
	        return 0;
	    } else {
	        return 1;
	    }
	}
}
