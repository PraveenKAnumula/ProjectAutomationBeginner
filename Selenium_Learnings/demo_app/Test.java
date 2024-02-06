package demo_app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	    static WebDriver driver;
	
	    public static void initializer() {
	    	
	        driver = new FirefoxDriver();
	        driver.get("https://www.advantageonlineshopping.com/#/");
	        driver.manage().window().maximize();
	    }
          
	    public static void addProduct() {
	    	
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	  // Wait for the Speakers category to be clicked using switch case and while loop
	    
	    int category=5;
	    {    	
		switch (category) {
		
		case 1:		
			WebElement miceCategory = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[aria-label='MiceCategory']")));
			miceCategory.click();
				 break;
			
		case 2:
		WebElement Tabletscategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='TabletsCategory']")));
		Tabletscategory.click();
			     break;
			     
		case 3:
		WebElement HeadphonesCategory = wait.until(ExpectedConditions.elementToBeClickable(By.className("twoRows categoryCell")));
		HeadphonesCategory.click();
				 break;
				 
		case 4:
		WebElement LaptopsCategory = wait.until(ExpectedConditions.elementToBeClickable(By.id("laptopsImg")));
		LaptopsCategory.click();
		         break;
			        
		case 5:
	
		WebElement speakersCategory = wait.until(ExpectedConditions.elementToBeClickable(By.id("speakersImg")));
		speakersCategory.click();
				break;
		    }
		    category++;
	    		
			}
	        // Wait for the speaker product image to be clicked
			
	        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='imgProduct']")));
	        product.click();

	        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@name,'cart')]")));
	        addToCart.click();
	        
	    }

	    public static void checkout() {
	     
	        Actions act = new Actions(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        // Move to the cart and click on checkout
	        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.id("menuCart")));
	        act.moveToElement(cart).perform();

	        WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.name("check_out_btn")));
	        checkout.click();
	        
	    }
	    public static void Register() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      // click on register
	        WebElement register = wait.until(ExpectedConditions.elementToBeClickable(By.id("registration_btn")));
	        register.click();
	    }
	    public static void Createaccount() {
	    	
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='usernameRegisterPage']")));
	    	  
	    	 if (user.isDisplayed()) {
	    		 System.out.println("Registration form is displayed");
				user.click();
				user.sendKeys("AnumulaPraveenK");
				System.out.println("username entered");
			}
	    	String emailid=Malitnor.getSaltString()+"@gmail.com";
	    	String paswd="@Praveen003";
	    	
	    	//an array of a character 
	    	char[] cityname={'H','y','d','e','r','a','b','a','d'};  
	    	
	    	//String 's' stores Cityname=Hyderabad
	    	String s=new String(cityname); 
	    	
	    	int pincode=500071;

	    	// Convert the integer to a string to use in sendkeys
	        String PostalPin = Integer.toString(pincode);
            //enter email
	        
	    	 WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.name("emailRegisterPage")));
			 email.click();
			 email.sendKeys(emailid);
			//enter password
			 WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.name("passwordRegisterPage")));
			 password.click();
			 password.sendKeys(paswd);
			 //Reenter password
			 WebElement confirmpaswd = wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm_passwordRegisterPage")));
			 confirmpaswd.click();
			 confirmpaswd.sendKeys(paswd);
			 
			 //enter Firstname
			 WebElement Firstname = wait.until(ExpectedConditions.elementToBeClickable(By.name("first_nameRegisterPage")));
			 Firstname.click();
			 Firstname.sendKeys("Anumula");
			//enter Lastname
			 WebElement Lastname = wait.until(ExpectedConditions.elementToBeClickable(By.name("last_nameRegisterPage")));
			 Lastname.click();
			 Lastname.sendKeys("Praveen");
			//enter Phone number
			 WebElement Phone = wait.until(ExpectedConditions.elementToBeClickable(By.name("phone_numberRegisterPage")));
			 Phone.click();
			 Phone.sendKeys("9700455456");
			 
			//enter Phone number
			 Select drpCountry = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
			 drpCountry.selectByVisibleText("India");
			 
			//enter city
			 WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.name("cityRegisterPage")));
			 city.click();
			 city.sendKeys(s);
			 
			//enter PinCode
			 WebElement Pin = wait.until(ExpectedConditions.elementToBeClickable(By.name("postal_codeRegisterPage")));
			 Pin.click();
			 Pin.sendKeys(PostalPin);
			 
			//check the checkbox
			 WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.name("i_agree")));
			 checkbox.click();
			 
			//enter Phone number
			 WebElement promotions = wait.until(ExpectedConditions.elementToBeClickable(By.name("allowOffersPromotion")));
			 promotions.click();
			 
			//Un-check the promotions
			 WebElement CreateAcc = wait.until(ExpectedConditions.elementToBeClickable(By.id("register_btn")));
			 if (CreateAcc.isDisplayed()) {
				  CreateAcc.click();
				  
				  
				System.out.println("clicked create account");
			 }
				else {
				System.out.println("create account is not displayed");	
				
			}
			  
				 WebElement Next = wait.until(ExpectedConditions.elementToBeClickable(By.id("next_btn")));
				 Next.click();
			  
			 }
	    public static void Payment() {
	    	
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   	 
	    	 WebElement safepayuser = wait.until(ExpectedConditions.elementToBeClickable(By.name("safepay_username")));
	    	 safepayuser.click();
	    	 safepayuser.sendKeys("Anumula");
	    	 WebElement safepaypaswd = wait.until(ExpectedConditions.elementToBeClickable(By.name("safepay_password")));
	    	 safepaypaswd.click();
	    	 safepaypaswd.sendKeys("@Praveen1");
	    	 WebElement Safelogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='pay_now_btn_SAFEPAY']")));
	    	 Safelogin.click(); 
	    	 WebElement ordersuccess = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='orderPaymentSuccess']")));
	
	    	 if (ordersuccess.isDisplayed()) {
	    		 
		   System.out.println("Order successful");
	} 
	   else {
		   System.out.println("order failed");
	   }
 }
	    }
	
