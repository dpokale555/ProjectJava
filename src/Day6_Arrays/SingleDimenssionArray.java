package Day6_Arrays;

public class SingleDimenssionArray {

	public static void main(String[] args) {
		// 1)Declare an array and inserting value
		
		//Approach 1
		/*int a[]= new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		//Approach 2
		int a[]= {100,200,300,400,500,600};
		
		//3) find size of an array
		
		System.out.println(a.length);
		System.out.println("");
		
		//4) read single/specific value from an array
		System.out.println(a[4]);
		System.out.println("");
		
		//5) read multiple value from an array using normal "for loop"
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("");
		
		//6) read multiple value from an array using enhanced for loop
		for (int x:a)
		{
			System.out.println(x);
		}
		
	}
}
