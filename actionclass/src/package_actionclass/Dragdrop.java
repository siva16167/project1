package package_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

WebDriver driver=new FirefoxDriver();

driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

//WebElement dragg=driver.findElement(By.id("draggable"));

//WebElement drop=driver.findElement(By.id("droppable"));

Actions act=new Actions(driver);
act.clickAndHold(driver.findElement(By.id("draggable")))
.moveToElement(driver.findElement(By.id("droppable")))
.release().build().perform();

//act.dragAndDrop(dragg, drop).perform();

String drop_text=driver.findElement(By.xpath("/html/body/div[2]/p")).getText();

System.out.println(drop_text);

if(drop_text.equals("Dropped!"))
{

System.out.println("test verified");

	}
else {
	System.out.println("text not verified");
}

}
}