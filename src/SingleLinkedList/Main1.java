package SingleLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * 	Write a class that maintains the top ten scores for a game application, 
 * implementing the add and remove methods, but using a singly linked list
	instead of an array.
 */
public class Main {
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20, 21, 22, 23, 24, 25, 26, 27, 28
				,29, 30, 31, 32, 33, 34, 35};
		LinkedList<Integer> ll = new LinkedList<>();
		int i = 0;
		while(i != 20) {
			ll.add(number[(int)(Math.random() * number.length)]);
			i++;
		}
		sorting(ll);
		ListIterator<Integer> reverseIterator = ll.listIterator(ll.size() - 1);
		while(reverseIterator.hasPrevious()){
			System.out.println(reverseIterator.previous());
		}
	}
	
	public static void sorting(LinkedList<Integer> ll) {
		Collections.sort(ll);
	}
}
