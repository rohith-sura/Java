import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// add(), addAll(), add(index, value), set(index, value)
		List<String> names = new LinkedList<>();
		List<String> cars = new LinkedList<>();

		cars.add("Ramesh");
		cars.add("Rohith");

		names.add("Ramesh");
		names.add("Suresh");
		names.addAll(names);
		names.add(2, "Rohith");
		names.set(3, "jagadeesh");

		System.out.println(names);

		// contains(), remove(), removeAll(), clear(), retainAll()
		System.out.println(names.contains("Rohith"));
		System.out.println(names.containsAll(cars));
		System.out.println(names.remove(3));
		// cars.clear();
		// System.out.println(cars);
		names.retainAll(cars);
		System.out.println(names); // prints only have same elements in both lists

		// isEmpty(), size()
		System.out.println(names.isEmpty());
		System.out.println(names.size());

		// iterator(), stream(), toArray()
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("\n");

		for (String i : names) {
			System.out.println(i);
		}

	}

}
