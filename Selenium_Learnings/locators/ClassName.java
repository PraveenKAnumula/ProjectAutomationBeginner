package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://www.automatetheplanet.com/ecommerce-website-test-automation-selenium/");
	        
	       driver.manage().window().maximize();
	      
	       WebElement learn=  driver.findElement(By.className("tve-sidebar-close-icon"));
	       
	     learn.click();
	}

}
