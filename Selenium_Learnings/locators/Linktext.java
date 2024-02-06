package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		
		   WebDriver driver = new ChromeDriver();

	        driver.get("https://www.hdfcbank.com/");
	        
	        driver.manage().window().maximize();
	      
	       driver.findElement(By.linkText("SME")).click();
	       
  
	    }

	}

