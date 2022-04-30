import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) {
		
		//Iterator is used to iterate or to traverse the collection one by one
		//hasNext() which return true if there is next element
		//next() which points to next element (default it won't point any)
		//remove() which removes the next element in the collection
		
		//ListIterator is used to iterate ArrayList, linkedList which have few extra methods than Iterator
		
		List<Integer> cars = new LinkedList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			cars.add(i);
		}
		
		System.out.println(cars);
		
		//Iterating using iterator
		Iterator<Integer> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			if(it.next()%2 == 0) {
				it.remove();
			}
		}
		
		System.out.println(cars);

		//Iterating using for loop
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}

}
