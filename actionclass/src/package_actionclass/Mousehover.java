package package_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.gecko.driver","E:\\eclipse-workspacesiva\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// navigate the application url

		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/index.php");

		//Get the Title of the WebPage
		
		String title=driver.getTitle();
		
		//print the title of the webpage
		
		System.out.println(title);
		
		//Verify Title of the WebPage
		
		if (title.equals("Administration")) {
			System.out.println("title verified successfully");
		} else {
			System.out.println("title not verified successfully");
		}
		
		// Enter the username
		
		driver.findElement(By.name("txtUserName")).sendKeys("sivasekhar");
		driver.findElement(By.name("txtPassword")).sendKeys("sivasekhar");
		driver.findElement(By.name("Submit")).click();
		 
		String text = driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
		
		
		System.out.println(text);
		//  To verify whether the welcome page successfully opened or not

		if (text.equals("Welcome sivasekhar"))
		{
			System.out.println("Welcome page verified successfully");
		} else {
			System.out.println("Welcome page  not verified successfully");
		}
		
		Actions act1=new Actions(driver);

		act1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/a/span"))).perform();
		
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/ul/li[2]/a/span")).click();
		
	    
		
	    
	}

}
