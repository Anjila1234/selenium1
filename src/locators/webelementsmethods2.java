package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsmethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebElement.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	}

}
