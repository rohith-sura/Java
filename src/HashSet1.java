import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		// HashSet is a collection of items where every item is unique

		HashSet<String> cars = new HashSet<String>();
		
		// add() to add the item to the HashSet
		cars.add("Ramesh");
		cars.add("Suresh");
		cars.add("Ramesh");
		cars.add("Rajesh");
		
		System.out.println(cars);
		//As we are using HashSet, output will be [Ramesh, Suresh] as it takes only unique items
		
		//size() to get the size of HashSet
		System.out.println(cars.size());
		
		//contains() to check whether the element is present
		System.out.println(cars.contains("Rohith"));
		
		//remove() to remove an element based on index; Gives true when item removed successful and false when item is not present
		System.out.println(cars.remove("Rajesh"));
		
		//cars.removeAll(cars) and cars.clear() removes all the items from the HashSet 
		cars.removeAll(cars);
		System.out.println(cars);
		
	}

}
