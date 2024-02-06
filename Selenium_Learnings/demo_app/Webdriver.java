package demo_app;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
 
public static void initializer() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
}
        public static void main(String[] args)  {
    }
    }

