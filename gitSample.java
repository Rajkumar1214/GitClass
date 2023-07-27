package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gitSample {

	public static void main(String[] args) {

		//Chrome Launch
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				
		//Login PopOut
				try {
					WebElement popOutClose = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2doB4z']")));
					if (popOutClose.isDisplayed() && popOutClose.isEnabled()) {
						popOutClose.click();
					}
				} catch (Exception e) {
					System.out.println("Pop-up close button not found or not clickable.");
				}
		//Travel Element
				WebElement travel = null;
				if (driver.findElements(By.xpath("//div[text()='Travel']")).size() > 0) {
					travel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Travel']")));
				} else if (driver.findElements(By.xpath("//span[text()='Travel']")).size() > 0) {
					travel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Travel']")));
				}
				if (travel != null) {
					travel.click();
				} else {
					System.out.println("Travel element not found.");
				}


	}

}
