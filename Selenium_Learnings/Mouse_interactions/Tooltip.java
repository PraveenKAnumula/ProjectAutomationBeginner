package Mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class Tooltip {

	
	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/social-icon.html");

	     String expectedTooltip = "Home";	
	        
	        // Find the tooltip icon at the top right of the header		
	        WebElement tooltip = driver.findElement(By.xpath("//a[@href='https://www.guru99.com/'][contains(.,'Demo Site')]"));	
	        
	        //get the value of the "title" attribute of the tooltip		
	        String actualTooltip = tooltip.getAttribute("title");	
	        
	        //Assert the tooltip's value is as expected 		
	        System.out.println("Actual Title of Tool Tip is " + actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
	        driver.close();			
	   }		
	}	 

		 

