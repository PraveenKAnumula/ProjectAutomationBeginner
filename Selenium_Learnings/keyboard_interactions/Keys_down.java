package keyboard_interactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_down {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
		driver.manage().window().maximize();
		
		
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).perform();

	}

}
