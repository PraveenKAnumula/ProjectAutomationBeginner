package Mouse_interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Context_click {


		
			public static void main(String[] args) throws InterruptedException{
				WebDriver driver = new ChromeDriver();
				
				//Launching Sample site
				driver.get("https://artoftesting.com/samplesiteforselenium");
				
				//Right click in the TextBox
				Actions action = new Actions(driver);
				WebElement searchBox = driver.findElement(By.id("fname"));
				action.contextClick(searchBox).perform();
				
				//Thread.sleep just for user to notice the event
				Thread.sleep(3000);
				
				//Closing the driver instance
				driver.quit();
			}
		

	

}
