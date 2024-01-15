package Day6_Arrays;

public class TwoDimArray_withdiffrentdata {

	public static void main(String[] args) {
		Object a[][]= {{100.00,"Sagar"},{196.40,"Abhi"},{200.00,true}};
		
		for(Object x[]:a)
		{
			for (Object v:x)
			{
				System.out.print(v+"    ");
			}
			System.out.println();
		}

	}

}
