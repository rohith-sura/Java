import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {

		// Followed
		// https://www.w3resource.com/java-exercises/collection/index.php#arraylists

		List<String> colors = new ArrayList<String>();

		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");

		System.out.println(colors);

		// Iterating using iterator()
		Iterator<String> it = colors.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Adding element using add(index, value)
		colors.add(0, "White");
		System.out.println(colors.get(0));

		// changing element value based on the index using set()
		colors.set(2, "Black");
		System.out.println(colors);

		// removing element based on index
		System.out.println(colors.remove(2));

		// checking for presence of element using contains()
		Boolean contain = colors.contains("White");
		if (contain == false)
			System.out.println("Does not contains the element");
		System.out.println("Contains the element");

		// Sorting elements in ascending order
		Collections.sort(colors);
		System.out.print(colors);
		System.out.println("\n");

		// copying from one list to another. Can use copy()
		List<String> new_colors = new ArrayList<String>();
		new_colors = colors;

		// Shuffling a list
		Collections.shuffle(new_colors);
		System.out.println(new_colors);

		// reverse of a collection
		Collections.reverse(new_colors);

		// Creating subList
		List<String> subString = new_colors.subList(0, 2);
		System.out.println(subString);

		// Swapping elements
		Collections.swap(colors, 0, 2);
		System.out.println(colors);

		// join two collections
		List<String> joined = new ArrayList<String>();
		joined.addAll(colors);
		joined.addAll(new_colors);

		// Iterating list using for-each
		for (String a : joined) {
			System.out.println(a);
		}

		// removing all or clearing or empty collection
		joined.clear();
		joined.removeAll((joined));

		// isEmpty()
		if (joined.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");

		// Trim to size
		((ArrayList<String>) new_colors).trimToSize();

		((ArrayList<String>) new_colors).ensureCapacity(6);
		System.out.println(new_colors.size());

		new_colors.add("Brown");
		new_colors.add("Orange");
		new_colors.add("Purple");
		new_colors.add("Voilet");

		System.out.println(new_colors);

	}

}
