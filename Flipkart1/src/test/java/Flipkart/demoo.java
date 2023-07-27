package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class demoo {

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.makemytrip.com/flights/");
	        driver.manage().window().maximize();
	       
	        driver.findElement(By.className("[class=\"modalMain tcnFooter\"]")).click();
	      
	       
	        }
	}


