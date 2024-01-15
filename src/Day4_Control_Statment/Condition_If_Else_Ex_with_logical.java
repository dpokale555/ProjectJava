package Day4_Control_Statment;

public class Condition_If_Else_Ex_with_logical {

	public static void main(String[] args) {
		int a=100,b=300,c=100;
		
		if(a>b && a>c && b>c)
		{
			System.out.println("Num a is a largest and Num c is a smallest");
		}
		else if (a>b && c>b && c>b)
		{
			System.out.println("Num a is a largest and Num b is a smallest");
		}
		else if(b>a && b>c && c>a)
		{
			System.out.println("Num b is a largest and Num a is a smallest");
		}
		else if(b>a && b>a && a>c)
		{
			System.out.println("Num b is a largest and Num c is a smallest");
		}
		else if(c>a && c>b && b>a)
		{
			System.out.println("Num c is a largest and Num a is a smallest");
		}
		else if(c>a && c>b && a>b)
		{
			System.out.println("Num c is a largest and Num b is a smallest");
		}
		else
		{
			System.out.println("found Matching number, Please change the number");
		}
	}

}
