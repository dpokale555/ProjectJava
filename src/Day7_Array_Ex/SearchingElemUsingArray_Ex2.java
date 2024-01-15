package Day7_Array_Ex;

public class SearchingElemUsingArray_Ex2 {

	public static void main(String[] args) {
		// using enhanced for loop
		
		int a[]= {23,21,30,40,60,21,30};
		int num=20;
		
		boolean status=false;
		
		for (int x:a)
		{
			if(num==x)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
		System.out.println("Element not found");
		}

	}

}
