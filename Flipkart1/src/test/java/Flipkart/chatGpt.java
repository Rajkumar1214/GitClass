package Flipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class chatGpt {
    public static void main(String[] args) {

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Implicitly wait for elements to be found in the DOM
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the travel website
        driver.get("https://www.makemytrip.com/");

        try {
            // Perform actions on the website
            WebElement originInput = driver.findElement(By.id("origin"));
            originInput.sendKeys("Mumbai, India");

            WebElement destinationInput = driver.findElement(By.id("destination"));
            destinationInput.sendKeys("Los Angeles");

            WebElement dateInput = driver.findElement(By.id("date"));
            dateInput.sendKeys("2023-08-15");

            WebElement searchButton = driver.findElement(By.id("searchButton"));
            searchButton.click();

            // Wait for the search results to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Select a flight and proceed to booking
            WebElement selectButton = driver.findElement(By.xpath("//button[@class='select-button']"));
            selectButton.click();

            // Fill in passenger details
            WebElement nameInput = driver.findElement(By.id("passengerName"));
            nameInput.sendKeys("John Doe");

            WebElement emailInput = driver.findElement(By.id("passengerEmail"));
            // Additional actions can be performed on the emailInput element if required.

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            // Handle exceptions (if any)
            e.printStackTrace();
        }
    }
}
