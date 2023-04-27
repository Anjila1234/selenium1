package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

//		List <WebElement> a1 = driver.findElements(By.cssSelector("div[id='thumbnail-1']"));
//		System.out.println(a1.size());
		// retrive no of tables

//		List<WebElement> a2 = driver.findElements(By.xpath("//*[table]"));
//		System.out.println(a2.size());

		// total no of rows
//
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"t01\"]/tbody/tr"));
//		System.out.println(rows.size());
//
//		// total no of column
//		List<WebElement> columns = driver.findElements(By.xpath("//table[@id=\"t01\"]/tbody/tr[2]/td"));
//		System.out.println(columns.size());
		
		
//Total ages
//		int sum = 0;
//		for (int i = 2; i <= rows.size(); i++) {
//			String a1 = driver.findElement(By.xpath("//table[@id=\"t01\"]/tbody/tr[" + i + "]/td[3]")).getText();
//			System.out.println(a1);
//			sum = sum +Integer.parseInt(a1);
//
//		}
//		System.out.println(sum);
		
		
		
		
//		int sum = 0;
//
//		for (int i = 2; i <= rows.size(); i++) {
//			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[3]")).getText();
//		//	System.out.println(text);
//			sum = sum  + Integer.parseInt(text);    // 45+94+20  // "45" ===> 45
//			
//		}
//		System.out.println(sum);
		
		//person name with John
		
//		String fn = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td[1]")).getText();
//		if(fn.contains("John")) {
//			System.out.println("test case pass");
//		}
	//	Or by looping
	for(int i =2; i<= rows.size(); i++) {
			String fn1 = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[2]")).getText();
		if(fn1.contains("Smith")) {
			System.out.println("test case pass");
		
		}
	}
//	for (int i = 2; i <= rows.size(); i++) {
//		String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[2]")).getText();
//		//System.out.println(text);
//		if(text.equals("Jackson")) {
//			System.out.println("Testcase pass ");
//			break;
//		}
//
//	}
}}
