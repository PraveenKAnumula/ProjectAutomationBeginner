package Mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
                
		Actions act=new Actions(driver);
		
        WebElement DClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(DClick).build().perform();
	  
		String alertmsg=driver.switchTo().alert().getText();   //this reads the alert message which is displayed.
	       System.out.println(alertmsg);
	}

}
