package SingleLinkedList;

// Insert a Node at specific position - Hackerrank
public class Main2 {
	public static void main(String[] args) {
		
	}
}
class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        if(llist == null){
            return llist;
        } else {
            var temp = llist;
            var temp2 = llist;
            var newNode = createNode(data);
            int i = 0;
            while(temp != null && i != position){
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = newNode;
            newNode.next = temp;
            return llist;
        }
    }
    public static SinglyLinkedListNode createNode(int data){
        var newNode = new SinglyLinkedListNode(data);
        return newNode;
    }
}

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}