package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnElementUsingId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mtlnovel.com/");
	
		driver.findElement(By.id("m-lang-btn")).click();
		

	}

}
