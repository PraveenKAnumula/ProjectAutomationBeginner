package demo_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Add_to_cart extends Webdriver {

    public static void addProduct() {
        // Wait for the Speakers category to be clickable
    	WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement speakersCategory = wait.until(ExpectedConditions.elementToBeClickable(By.id("speakersImg")));
        speakersCategory.click();

        // Wait for the product image to be clickable
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='imgProduct']")));
        product.click();

        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@name,'cart')]")));
        addToCart.click();
    }

    public static void main(String[] args) {
        initializer();
        addProduct();
    }
}
