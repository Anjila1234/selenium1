package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");

		// arrangements
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// action
		WebElement FirstName = driver.findElement(By.cssSelector("input[name=first_name]"));
		WebElement LastName = driver.findElement(By.cssSelector("input[name=last_name]"));
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		WebElement comment = driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
		WebElement submit = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		WebElement reset = driver.findElement(By.cssSelector("input[type=\"reset\"]"));
//FirstName.sendKeys("Anjila");
//	LastName.sendKeys("Katuwal");
//	email.sendKeys("anzelakatuwal@gmail.com");
//	comment.sendKeys("I am anjila");
//	comment.sendKeys("I am Anjila");
//	submit.click();
//	Thread.sleep(5000);
//	
//	//assertions
//	String currenturl = driver.getCurrentUrl();
//	System.out.println(currenturl);
//	if(currenturl.contains("Contact-Us/contact-form-thank-you.html")) {
//		System.out.println("pass");}
//		else {
//			System.out.println("fail");
//		}
//	driver.close();

//Negative	
//	FirstName.sendKeys("Anjila");
//	LastName.sendKeys("Katuwal");
//	email.sendKeys("anzelakatuwal@gmail.com");
//	comment.sendKeys("");
//	//submit.click();
//	
//	Thread.sleep(5000);
//	
//boolean errormsg = driver.findElement(By.cssSelector("textarea[name=\"message\"]")).isDisplayed();
//if(errormsg) {
//	System.out.println("passed");
//}
//else {
//	System.out.println("Failed");
//}
//	
		// Retest

		FirstName.sendKeys("Anjila");
		LastName.sendKeys("Katuwal");
		email.sendKeys("anzelakatuwal@gmail.com");
		comment.sendKeys("I am learning QA");
		reset.click();
		//Thread.sleep(5000);

//if(email.getAttribute("value").equals("")) {
//	System.out.println("Passed");
//}
//else {
//	System.out.println("failed");
//}

		WebElement contact = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
		boolean displayContact = contact.isDisplayed();
		if (displayContact) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		driver.close();

		driver.quit();

	}

}
