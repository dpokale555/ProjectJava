package Day5_Jumping_Statments;

public class Ex_ReveresThe_Number {

	public static void main(String[] args) {
		int i=4567;
		int rev=0;
		
		while(i!=0) 
		{
			rev=rev*10+i%10;
			i=i/10;
		}
		System.out.println(rev);

	}

}
