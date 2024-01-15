package Day6_Arrays;

public class TwoDimemsionalArray {

	public static void main(String[] args) {
		/*1)Approac 1
		//a)Declaration
		int a[][]=new int[3][2];
		//int [][]a=new int[3][2];   correct syntax
		//int []a[]=new int[3][2];   correct syntax
		
		//b)inserting value
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;*/
		
		//2)Approach 2
		int a[][]= {
					{100,200,150},
				    {300,400,350},
				    {500,600,550},
				    {700,800,750}
				    };
		
		//c)find size of array
		System.out.println("numbers of rows:"+a.length);
		System.out.println("numbers of col:"+a[0].length);
		System.out.println("");

		//d) read a specific values from array
		System.out.println(a[1][0]);
		System.out.println("");
		
		//e) read multiple values from array nested for loop
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
