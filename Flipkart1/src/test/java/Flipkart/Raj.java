package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Raj {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        try {
            // Handle the popup if it exists
            if (driver.findElements(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).size() > 0) {
                WebElement popOutClose = driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
                popOutClose.click();
            }

            // Hover over the "Electronics" menu
            WebElement electronics = driver.findElement(By.cssSelector("div[aria-label='Electronics']"));
            Actions act = new Actions(driver);
            act.moveToElement(electronics).build().perform();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Duration object

            // Wait for the "Laptop Accessories" option to be visible and click on it
            WebElement laptopAccessories = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptop Accessories']")));
            act.moveToElement(laptopAccessories).build().perform();

            // Wait for the "UPS" option to be visible and click on it
            WebElement ups = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='UPS']")));
            ups.click();

            // Click on the "Brand" filter and select a specific checkbox (ZEBRONICS)
            WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
            brand.click();

            WebElement checkBox = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[2]"));
            checkBox.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser at the end
           // driver.quit();
        }
    }



	}


