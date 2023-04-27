package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebChrome.Chrome.driver","C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean p1 = driver.findElement(By.partialLinkText("book")).isDisplayed();
		if(p1) {
			System.out.println("Testcase pass");
			}
		else {
			System.out.println("Testcase fail");
		}
	}

}
