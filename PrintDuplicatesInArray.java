package week3.day2.assginment;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// get the length of the array
			int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			
			Set<Integer>set=new HashSet<Integer>();
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int i = 0; i < arr.length; i++) {
				if(set.add(arr[i])==false) {
					System.out.println(arr[i]+"is duplicated in the array");
				}
			}
			

	}

}
