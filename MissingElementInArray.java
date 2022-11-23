package week3.day2.assginment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		List<Integer>arr=new ArrayList<Integer>();
		// Here is the input
		//int[] arr = {1,2,3,4,7,6,8};
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(6);
		arr.add(8);

		Collections.sort(arr);
		
		for (int i = 0; i < arr.size()-1; i++) {
			if (arr.get(i)+1 != arr.get(i+1)) {
				System.out.println("Missing Array is " + (i+1));
				break;
			}
		}

	}

	}


