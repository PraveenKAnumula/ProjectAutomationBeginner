package Mouse_interactions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drap_and_Drop {


			public static void main(String[] args) throws Exception {
			
				
				WebDriver driver = new ChromeDriver();

		      
		        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		       
		        driver.manage().window().maximize();
		        
		        Thread.sleep(4000);

		        WebElement Drag=driver.findElement(By.xpath("//div[contains(.,'Draggable')]"));
		        WebElement Drop=driver.findElement(By.xpath("//div[contains(.,'Droppable')]"));
		        new Actions(driver).dragAndDrop(Drag, Drop).build().perform();

		      Thread.sleep(4000);
		        
		        driver.quit();

	}

}
