package demo_app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout extends Add_to_cart {
	public static void checkoutproduct(){
		 WebDriver driver = new ChromeDriver();
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  Actions act=new Actions(driver);
       WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.id("menuCart"))); 
       act.moveToElement(cart).perform();
       WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.name("check_out_btn")));
       checkout.click();
	}


	public static void main(String[] args) {
		
		
		 initializer();
		 addProduct();
		 checkoutproduct();
		
	}

}
