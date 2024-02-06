package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		
		   WebDriver driver = new ChromeDriver();

	        driver.get("https://www.automatetheplanet.com/ecommerce-website-test-automation-selenium/");
	        
	       driver.manage().window().maximize();
	      
	       WebElement searchbar=  driver.findElement(By.name("s"));
	       
	     searchbar.sendKeys("It is working");
	    
	     
	    }

	}


