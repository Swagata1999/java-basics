package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("banana");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);

	}

}