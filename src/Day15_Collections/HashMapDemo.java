package Day15_Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration -approach1
		HashMap hm1=new HashMap();
		
		//Declaration -approach2
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();		
		
		//add data into hashmap
		hm2.put(101, "jhon");
		hm2.put(102, "Davis");
		hm2.put(103, "Marry");
		hm2.put(104, "Davis");                 //duplicate value allowed
		hm2.put(101, "xyz");                  //duplicate key not allowed but it overwrite with new value
		
		System.out.println(hm2);
		
		//size of elements pair 
		System.out.println("size of hashmap:"+hm2.size());
		
		//remove the elements pair
		hm2.remove(104);
		System.out.println("After removing 104 :"+hm2);
		
		//get the value from specfic value
		System.out.println(hm2.get(102));
		
		//print only keys from the hashmap
		System.out.println(hm2.keySet());
		
		//print only vaules from the hashmap using looping statment
		
		for(int k:hm2.keySet())
		{
			System.out.println(hm2.get(k));
			System.out.println(k+" "+hm2.get(k));
		}
		
		//cleare the hashmap
		hm2.clear();
		System.out.println(hm2);
		
		
		
		

	}

}
