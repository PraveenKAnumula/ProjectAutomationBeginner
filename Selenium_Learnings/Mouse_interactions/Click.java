package Mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hdfcbank.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	             Actions act=new Actions(driver);
	
	WebElement PersonalLoan=driver.findElement(By.xpath("//div[contains(@class, 'heading') and text()='Personal Loan EMI Calculator']"));
	PersonalLoan.click();
  
}
}
