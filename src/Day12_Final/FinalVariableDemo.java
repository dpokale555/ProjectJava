package Day12_Final;

public class FinalVariableDemo {
	
	final int speed=100;

	public static void main(String[] args) 
	{
		FinalVariableDemo fm=new FinalVariableDemo();
		//fm.speed=200;                            // we can not change the value of variable if we applied 'final' keyword
		System.out.println(fm.speed);
	
	}

}
