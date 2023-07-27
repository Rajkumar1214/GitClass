package Flipkart;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class diwakar {

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

			//Travel & Class
					WebElement travelclass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Travellers | Class']")));
					Actions actions = new Actions(driver);
			        actions.moveToElement(travelclass).click().perform(); //action used for some click interaction that time used this will click exact one
					WebElement passengerAdultCount=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"_2KpZ6l _34K0qG _37Ieie\"])[1]")));
					passengerAdultCount.click();
					WebElement passengerChildrenCount=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"_2KpZ6l _34K0qG _37Ieie\"])[3]")));
					passengerChildrenCount.click();

					WebElement cabinClass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Business']")));
					cabinClass.click();
					WebElement doneButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Done']")));
					doneButton.click();
					WebElement conformText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3SCHpg _1Jqgld']/input[@type='text']")));
					String value=conformText.getAttribute("value");
					System.out.println(value);
					driver.quit();

				}

			
	}


