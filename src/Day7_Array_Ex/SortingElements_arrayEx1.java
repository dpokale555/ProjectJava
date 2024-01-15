package Day7_Array_Ex;

import java.util.Arrays;

public class SortingElements_arrayEx1 {

	public static void main(String[] args) {
		// sorting the elements using predefine class in JAVA
		
		int a[]= {200,400,100,300,500,150};
		String b[]= {"wer","fgh","rew","ret"};
		
		
		System.out.println("Before Sorting :"+Arrays.toString(a));   //predifine class & method for printing arrays
		System.out.println("Before Sorting :"+Arrays.toString(b)); 
		
		Arrays.sort(a);                                            //predefine class & method for sorting
		Arrays.sort(b); 
		
		System.out.println("After Sorting :"+Arrays.toString(a));
		System.out.println("After Sorting :"+Arrays.toString(b));
	}

}
