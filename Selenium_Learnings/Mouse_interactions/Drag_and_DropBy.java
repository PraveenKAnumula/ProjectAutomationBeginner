package Mouse_interactions;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Drag_and_DropBy {

			public static void main(String[] args) throws Exception 
			
			{

				WebDriver driver = new ChromeDriver();

		        driver.get("https://www.hdfcbank.com/");

		        driver.manage().window().maximize();
		  
		        Thread.sleep(4000);
		    	Actions act=new Actions(driver);
		    	
		    	WebElement PersonalLoan=driver.findElement(By.xpath("//div[@class='heading' and text()='Personal Loan EMI Calculator']"));
				                PersonalLoan.click();
		        WebElement slider=driver.findElement(By.xpath("//*[@id=\"js-rangeslider-0\"]/div[2]"));
		        act.clickAndHold(slider).moveByOffset(40, 0).build().perform();
		        
		        
		        // new Actions(driver).dragAndDropBy(scrollbutton, 40, 0).build().perform();

		       //Thread.sleep(4000);
		        
		        driver.quit();
			}
		}
