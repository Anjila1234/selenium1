package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class demopractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/");
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"menu-item-1513\"]/a")).click();
	
	
	boolean a1 =  driver.findElement(By.cssSelector("img[alt=\"GlobalSQA\"]")).isDisplayed();
	Thread.sleep(5000);
	if(a1) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	
	driver.close();
}


	

}
