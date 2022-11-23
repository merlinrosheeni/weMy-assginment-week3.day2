package week3.day2.assginment;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7};	 
		 //Declare another array for {1,2,8,4,9,7};
		 //Declare for loop iterator from 0 to array length
		 //Declare a nested for another array from 0 to array length
		 //Compare Both the arrays using a condition statement
		 //Print the first array (shoud match item in both arrays)
		int[] intArr = {3,2,11,4,6,7};
		int[] intArr1 = {1,2,8,4,9,7};

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr1.length; j++) {
				if (intArr[i] == intArr1[j]) {
					System.out.println(intArr[i]);
				}
			}
		}
	}

}
