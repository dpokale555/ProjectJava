package Day14_ExceptionHanling;

public class CheckedExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program started");
		System.out.println("Program in progress");
		
		/*try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}*/
		
		Thread.sleep(5000);
		
		System.out.println("Program completed");
		System.out.println("Program exit");

	}

}
