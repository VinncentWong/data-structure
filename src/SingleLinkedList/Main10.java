package SingleLinkedList;

public class Main10 {
	public static void main(String[] args) {
		
	}
}

class Solution2
{
	public static boolean compute(Node node)
    {
        Node temp = node;
        String a = "";
        while(temp != null){
            a += temp.data;
            temp = temp.next;
        }
        String b= "";
        for(int i = a.length() - 1 ; i >= 0 ; i--){
            b += a.charAt(i);
        }
        if(a.equals(b)){
            return true;
        } else {
            return false;
        }
    }
}