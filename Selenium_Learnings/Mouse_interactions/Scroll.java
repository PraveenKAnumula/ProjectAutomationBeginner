package Mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-3-vs-selenium-4");
		driver.manage().window().maximize();
		
		WebElement object=driver.findElement(By.xpath("//html[@lang='en-US']"));
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1500);
		
		Thread.sleep(4000);
		act.release(object).build().perform();
		
	}
	}


