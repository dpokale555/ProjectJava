package Day7_Array_Ex;

public class SearchingElementsUsingArray {

	public static void main(String[] args) {
		//using nested for loop
		
		int a[]= {55,30,38,30,50,60};
		int num=50;
		
		boolean status=false;
		
		
	for (int i=0; i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("Element Found at "+i+" position");
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
