package Day9_Methods_Type;

public class ThisKeyword {
	
	int x,y;       //Global variables or instance variables
	
	/*void setData(int a, int b)        //Local variables
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}*/
	
	//what if we assigne same name to global and loacl variable the we need to use keyword 'this'
	
	void setData(int x, int y)        //Local variables   
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
	
		ThisKeyword th=new ThisKeyword ();
		th.setData(200, 300);
		th.display();

	}

}
