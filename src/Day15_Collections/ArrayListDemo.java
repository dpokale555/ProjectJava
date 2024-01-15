package Day15_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//Approach 1 to declared the arraylist variable
		ArrayList mylist1=new ArrayList();
		
		//Approach 2 to declared the arraylist variable
		List mylist2=new ArrayList();
		
		ArrayList <Integer> mylist3=new ArrayList<Integer>();        //only one type of data (Integer) can store
		ArrayList <String> mylist4=new ArrayList<String>();        //only one type of data (String) can store

		//Add data elements in to arraylist
		mylist1.add(200);
		mylist1.add(20.30);
		mylist1.add("wellcome");
		mylist1.add('A');
		mylist1.add(true);
		mylist1.add(null);
		mylist1.add(200);
		mylist1.add(null);
		
		mylist3.add(3456);                          //only integer
		mylist4.add("fgh");                         //only string
		
		//size of arraylist
		System.out.println("Size of Arraylist:"+mylist1.size());
		
		//Dispaly for arraylist
		System.out.println("Arraylist elements:"+mylist1);
		
		//to remove the elements
		mylist1.remove(6);
		System.out.println("After Removing 6th elements:"+mylist1);
		
		//insertion of the value in the middle of the arraylist
		mylist1.add(3,"java");
		System.out.println("after instertion the 'java' at 3rd position:"+mylist1);
		
		//Extract the specsific value or read/retrive the value
		System.out.println(mylist1.get(2));
		
		//Retrieve the all values from arraylist
		for(Object x:mylist1)
		{
			System.out.println(x);
		}
			
		//clear the arraylist
		mylist1.clear();
		System.out.println(mylist1);
		
	}

}
