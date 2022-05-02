import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		//Followed https://www.w3resource.com/java-exercises/collection/index.php#linkedlist
		
		LinkedList<String> colors = new LinkedList<String>();
		
		//Adding elements
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Black");
		
		//Append a element to the end
		colors.addLast("White");
		
		//Append a element to the first
		colors.addFirst("Voilet");
		
		System.out.println(colors);
		
		//Iterating using for-each
		for(String i : colors) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//Iterating using for loop
		for(int i = 0; i <colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		System.out.println("\n");
		
		//Iterating using iterator()
		Iterator<String> it = colors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		
		//Iterating list from specified index
		Iterator<String> it1 = colors.listIterator(1);
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//Iterating in reverse order
		Iterator<String> it2 = colors.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//adding element at specific position
		colors.add(2, "Purple");
		
		//Inserting elements at first and last index
		colors.addFirst("Gray");
		colors.addLast("Blue");
		
		System.out.println(colors);		

	}

}
