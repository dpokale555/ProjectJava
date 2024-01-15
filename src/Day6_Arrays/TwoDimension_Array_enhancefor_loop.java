package Day6_Arrays;

public class TwoDimension_Array_enhancefor_loop {

	public static void main(String[] args) {
		int a[][]= {
					{100,200},
					{300,400},
					{500,600}
					};
		
		//data reading by using enhance for loop
		
		for (int x[]:a) 
		{
			for(int v:x) 
			{
				System.out.println(v);
			}
		}
	}

}
