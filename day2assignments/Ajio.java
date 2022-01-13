package week3.day2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.ajio.com");
//	chromedriver().setup();
//	ChromeDriver driver=new ChromeDriver();

	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//Thread.sleep(3000);

	driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
	//driver.findElement(By.id("Men")).click();
	Thread.sleep(2000);
	// To the left  of the screen under " Gender" click the "Men"
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	
	//Under "Category" click "Fashion Bags"
	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	Thread.sleep(2000);
	// Print the count of the items Found.
	String totalItems = driver.findElement(By.className("length")).getText();
	System.out.println("Total number of items : " + totalItems);
    //Get the list of brand of the products displayed in the page and print the list.
	System.out.println(" List of Brands");
	List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
	System.out.println(" Size :" + bagBrandList.size());

	for (WebElement webElement : bagBrandList) {
		String text = webElement.getText();
		System.out.println(text);
	}
	
}
}