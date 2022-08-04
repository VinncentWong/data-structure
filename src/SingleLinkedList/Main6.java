package SingleLinkedList;

// Check if Circular Linked List
public class Main6 {
	public static void main(String[] args) {
		
	}
	boolean isCircular(Node head)
    {
        Node temp = head;
        if(head == null){
            return true;
        } 
        boolean isValid = false;
        while(temp.next != null){
            temp = temp.next;
            if(temp == head){
                isValid = true;
                break;
            }
        }
        if(isValid){
            return true;
        } else{
            return false;
        }
        
    }
}


