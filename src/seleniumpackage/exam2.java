package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebElement.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.ht");

		driver.manage().window().maximize();
//Title
		String Title = driver.getTitle();
		System.out.println("Title is: + Title");
		if (Title.contains("ParaBank")) {
			System.out.println("passed");

		} else {
			System.out.println("failed");
		}
//URL
		String currentUrl = driver.getCurrentUrl();
		if (driver.getCurrentUrl().contains("parabank.parasoft.com")) {
			System.out.println("Url passed");
		} else {
			System.out.println("Url failed");
		}

		// Id
		boolean id = driver.findElement(By.id("leftPanel")).isDisplayed();
		if (id) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		// tagname
		boolean a2 = driver.findElement(By.tagName("h2")).isDisplayed();
		if (a2) {
			System.out.println("a2 is passed");
		} else {
			System.out.println("a2 is failed");
		}

//		// className
		boolean a3 = driver.findElement(By.className("login")).isDisplayed();
		if (a3) {
			System.out.println("a3 is passed");
		} else {
			System.out.println("a3 is failed");
		}
//		// Name
		boolean a4 = driver.findElement(By.name("username")).isDisplayed();

		if (a4) {
			System.out.println("Test case passed");
		} else {
			System.out.println("failed");
		}
//		// Xpath
		boolean a5 = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[1]")).isDisplayed();
		if (a5) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

//		// cssSelector
		boolean a6 = driver.findElement(By.cssSelector("input[type=\"password\"]")).isDisplayed();
		if (a6) {
			System.out.println("a2 is passed");
		} else {
			System.out.println("a2 is failed");
		}
		
		// linktext
		boolean a7 = driver.findElement(By.linkText("Home")).isDisplayed();
		if(a7) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		// partialtext
		boolean a8 = driver.findElement(By.linkText("ome")).isDisplayed();
		if(a8) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
