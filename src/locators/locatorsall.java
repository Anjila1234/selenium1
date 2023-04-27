package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebChrome.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgwNDY0MjAzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
	
	//ID
//WebElement email = driver.findElement(By.id("email"));
//email.sendKeys("anzelakatuwal@gmail.com");
//
////name
//WebElement name = driver.findElement(By.name("pass"));
//name.sendKeys("Missumom@1");
//
////cssSelector
//WebElement login = driver.findElement(By.cssSelector("button[value='1']"));
//login.click();
//	
//	//classname
//WebElement cname = driver.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6"));
//cname.sendKeys("Anjila");

//linktext
boolean link = driver.findElement(By.linkText("facebook")).isDisplayed();
if(link) {
	System.out.println("pass");}
else {
	System.out.println("fail");
}
	
	
	
	
	
	}

}
