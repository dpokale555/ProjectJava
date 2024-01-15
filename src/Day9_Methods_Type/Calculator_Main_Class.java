package Day9_Methods_Type;

public class Calculator_Main_Class {

	public static void main(String[] args) 
	{
		Calculator_Class cal=new Calculator_Class();
		
		//cal.add();                                    //1st method
		
		int res=cal.add();              
				System.out.println(res);                //2nd method
								//or
				System.out.println(cal.add());
				
		//cal.add(100, 300);                            //3rd method
		
		//int res1=cal.add(200, 300);                     //4th method
		//System.out.println(res1);
		
		

	}

}
