package wait;


import org.openqa.selenium.chrome.ChromeDriver;

public class Day1wait {
	public static void main(String[] args) {
		//four types of wait
		//implict - dynamic
		//explicit - dynamic
		//Thread - static- Its provided by Java
		//fluent- dynamic
	
	
	System.setProperty("WebDriver.Chrome.diver", "C:\\Users\\User\\Desktop\\chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.webdriveruniversity.com/");
	
	
	
	
	
	
	}

}
