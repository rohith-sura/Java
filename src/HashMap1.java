import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<Integer, String>();
	
		//put(key, value) used to add item to HashMap
		names.put(1, "Ramesh");
		names.put(2, "Suresh");
		names.put(3, "Rajesh");
		
		System.out.println(names);
		
		//size() used to get the size of the HashMap		
		System.out.println(names.size());
		
		//get() used to get the value based the given key
		System.out.println(names.get(2));
		
		//remove() used to remove an element based on the key
		names.remove(3);
		System.out.println(names);
		
		//Iterating HashMap can be done in 5 ways
	    //1. Iterate through a HashMap EntrySet() using Iterators.		
		//2. Iterate through HashMap KeySet using Iterator.
	    //3. Iterate HashMap using for loop and for-each loop.
		
		//for loop using keySet()
		for(int i : names.keySet()) {
			System.out.println(names.get(i));
		}
		
		//for loop using value()
		for(String i : names.values()) {
			System.out.println(i);
		}
		
		//forEach loop using keySet()
		
		
	    //4. Iterating through a HashMap using Lambda Expressions.
	    //5. Loop through a HashMap using Stream API.*/
		
		
	}
}
