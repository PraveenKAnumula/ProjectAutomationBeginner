package Mouse_interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_actions {

			public static void main(String[] args) throws Exception			
			{			
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.hdfcbank.com/");
				driver.manage().window().maximize();
				
			
				Thread.sleep(4000);
				WebElement login=driver.findElement(By.xpath("//*[@id=\"custom-button\"]/div/div/div/button"));
		      
				new Actions(driver).moveToElement(login).build().perform();
				Thread.sleep(4000);
				
				WebElement netbanking=driver.findElement(By.xpath("//a[text()='NetBanking' and @target='_blank']"));
				new Actions(driver).moveToElement(netbanking).build().perform();
				Thread.sleep(4000);
				
				WebElement clickAction=driver.findElement(By.xpath("//a[text()='NetBanking' and @target='_blank']"));
				new Actions(driver).click(clickAction).perform();  
									
}
			
}
