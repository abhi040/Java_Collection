package listConcept;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Ram");
		ll.add("Shayam");
		ll.add("Rahul");
		ll.add("Tom");
		
		System.out.println(ll);
		
		ll.addFirst("Harry");
		ll.addLast("Saurabh");
		
		System.out.println(ll);
		
		ll.add(0, "Heena");
		ll.add(7, "Toshiba");
		
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.get(7));
		
		ll.remove(0);
		ll.remove(6);
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println("*******using for loop");
		
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		System.out.println("******* using advance for loop");
		
		for(String str:ll) {
		System.out.println(str);
		}
		
		System.out.println("*******using Iterator");
		
		Iterator<String> it= ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("********using while loop");
		
		int num =0;
		while(num<ll.size()) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
