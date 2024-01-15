package Day16_Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

/*Manual Testcase step
 * 1) Open browser
 * 2)open url
 * 3)provide username
 * 4)provide paswd
 * 5)click on login
 */

public class FirstTestCase {

	public static void main(String[] args) 
	{
		//1)open the browser
		
		System.setProperty("webdriver.edge.driver","C:\\Drivers\\Driver_Edge_Browser\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Driver_Chrome_Browser\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();		
		 
		//2) open url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximaize();
		
		//3) put username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) provied the pswd
		driver.findElement(By.placeholder("Password")).sendKeys("admin123");
		
		//5) click on login
		driver.findElement(By.type("submit")).click();
		
		//6) closed the browser
		driver.close();*/

	}

}
