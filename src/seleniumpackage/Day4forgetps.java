package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4forgetps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//arrange
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
		// action
		// WebElement username = driver.findElement(By.cssSelector("input[name =\"username\""));
		// WebElement password =driver.findElement(By.cssSelector("input[type=\"password\""));
 driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
		// username.sendKeys("Admin");
		// password.sendKeys("dmin123");
 Thread.sleep(5000);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		if (currenturl.contains("requestPasswordResetCode")) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

		driver.close();
	}

}
