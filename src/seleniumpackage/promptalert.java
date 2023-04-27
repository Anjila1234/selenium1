package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebElement.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		
		//prompt-accept
//		driver.manage().window().maximize();
//		WebElement prompt = driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
//		prompt.click();
//
//		driver.switchTo().alert().sendKeys("Hello world");
//		driver.switchTo().alert().accept();
//
//		Thread.sleep(3000);
//		String Text = driver.findElement(By.id("result")).getText();
//		if (Text.equals("You entered: Hello world")) {
//			System.out.println("passed");
//		} else {
//			System.out.println("failed");
//		}
//		driver.quit();

		
		//prompt-dismiss
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
		//driver.switchTo().alert().sendKeys(null);
		driver.switchTo().alert().dismiss();
		String NoText = driver.findElement(By.id("result")).getText();
		
		Thread.sleep(3000);
		if(NoText.equals("You entered: null")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
	
	
	
	
	}

}
