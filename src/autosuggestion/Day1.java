package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
ChromeDriver driver = new ChromeDriver ();
driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");	
		
driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("c");	
List <WebElement> a1 = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));	
		
	for(int i = 0; i< a1.size(); i++ )	{
		//System.out.println(a1.get(i).getText());
	if(a1.get(i).getText().equals("Carrots")){
			a1.get(i).click();
			break;
			
			
		}
	}
	driver.findElement(By.xpath("//input[@id='submit-button']")).click();
		if(driver.getCurrentUrl().contains("Carrots")) {
		System.out.println("Pass");
		}
		else {
			System.out.println("fail");
			}
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
