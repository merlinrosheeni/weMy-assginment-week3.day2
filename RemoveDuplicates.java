package week3.day2.assginment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Use the declared String text as input
		//String text = "We learn java basics as part of java sessions in java week1";		
	 //Initialize an integer variable as count	  
	 //Split the String into array and iterate over it 
	 //Initialize another loop to check whether the word is there in the array
	 //if it is available then increase and count by 1. 
	 //if the count > 1 then replace the word as "" 
	 //Displaying the String without duplicate words	
String input = "We learn java basics as part of java sessions in java week1";
		
		String[] inputArr = input.split(" ");
		
		Set<String>set=new LinkedHashSet<String>();
		
		for (String s:inputArr) {
			set.add(s);
		}
		Iterator itr1=set.iterator();
          
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next()+" ");
		}
		
			
		
	}
	
}