package week3.day2.assginment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
List<Integer>sl=new ArrayList<Integer>();
// Here is the input
//int[] data = {3,2,11,4,6,7};
		sl.add(3);
		sl.add(2);
		sl.add(11);
		sl.add(4);
		sl.add(6);
		sl.add(7);
		
		Collections.sort(sl);
		//Arrange the array in ascending order
		// Pick the 2nd element from the last and print it
		for (int i = 0; i < sl.size(); i++) {
			int data = sl.get(i);
					
				}
	System.out.println(sl);
	Collections.sort(sl);
				
	System.out.println("Second largest number is " + sl.get(4));

	}

}
