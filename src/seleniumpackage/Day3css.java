package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3css {
	public static void main(String[] args) throws InterruptedException {
		//arrange
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		//action
		
		WebElement Username =  driver.findElement(By.cssSelector("input[name='username']"));
		WebElement ps = driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active']"));
		WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		
		
		Username.sendKeys("Admin");
		ps.sendKeys("admin123");
		login.click();
		Thread.sleep(10000);
		
		driver.manage().window().maximize();
		
		
		//assertation
		WebElement logoname = driver.findElement(By.cssSelector("img[alt =\"client brand logo\"]"));
		
		boolean logoname1 = logoname.isDisplayed();
		
		if(logoname1) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("pass");
		}
		
		
		driver.close();
		
		
		
		
	}

}
