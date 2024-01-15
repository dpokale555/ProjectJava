package Day9_Methods_Type;

public class MethodOverloading {

	int x,y,z;
	double d;
	
	void sum()              //1st type
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	
	void sum(int a, int b)    //2nd type : no of parameters are diffrent, method name and datatypes are same
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double b)    //3rd type: no of parameters are same, method name is same but datatypes are diffrent
	{
		x=a;
		d=b;
		System.out.println(x+y);
	}
	
	void sum(double b, int a)  //4th type: no of parameters are same, method name is same but datatypes is also same but sequence is diffrent
	{
		x=a;
		d=b;
		System.out.println(x+y);
	}
	
	void sum(int a, int b, double dec)  //5th type: no of parameters are same, method name is same but datatypes is also same but sequence is diffrent
	{
		x=a;
		y=b;
		d=dec;
		System.out.println(x+y+d);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.sum();                            //1st method
		mo.sum(200, 300);                    //2nd method
		mo.sum(100, 40.5);                   //3rd method
		mo.sum(30.5, 800);                   //4th method
		mo.sum(30, 50, 5.5);                 //5th method

	}

}
