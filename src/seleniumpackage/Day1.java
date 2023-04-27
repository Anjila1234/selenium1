package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://facebook.com");
           //driver.quit();
	}

}
