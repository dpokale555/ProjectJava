package Day15_Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet myset1=new HashSet();                         // declaration- Approach 1
		Set myset2=new HashSet();                             // declaration- Approach 2
		HashSet <Integer> myset3=new HashSet<Integer>();      // declaration- Approach 3 with same datatype
		       
		//add element in set
		myset1.add(100);
		myset1.add(10.56);
		myset1.add("welcome");
		myset1.add(true);
		myset1.add(null);
		myset1.add('A');
		myset1.add(100);                                   //duplicate not allowed
		myset1.add(null);                                  //duplicate null also not allowed
		
		System.out.println(myset1);
		
		//sixze of elements
		System.out.println("Size of set elemnts:"+myset1.size());
		
		//remove value from set
		myset1.remove(10.56);                              //we need to pass value, index is not support here
		System.out.println("After removing the value"+myset1);
		
		//insert the value in the middle of set is not possible we can only add
		//myset1.add(2,"dfg");    //incorrect
		
		//retrieve the value from set is also not possible
		
		//read the data from hashset one by one
		for(Object x:myset1)
		{
			System.out.println(x);
		}
		
		//clear the elemnts from set
		myset1.clear();
		System.out.println(myset1);
		
		
		

	}

}
