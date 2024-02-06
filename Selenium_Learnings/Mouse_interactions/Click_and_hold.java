package Mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_hold {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.manage().window().maximize();
		
		WebElement object=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(object).build().perform();
		Thread.sleep(4000);
		
	
		act.release(object).build().perform();
	}

}
