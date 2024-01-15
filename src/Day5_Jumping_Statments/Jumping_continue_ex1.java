package Day5_Jumping_Statments;

public class Jumping_continue_ex1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
