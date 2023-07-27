package Flipkart;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
       
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Open the Flipkart website
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        // Wait for the login popup and close it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement popupCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
            popupCloseButton.click();
        } catch (Exception e) {
            // The popup might not appear, so this block will handle the exception
        }

        // Wait for the "Login & Signup" element to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='xtXmba'])[7]"))).click();
        
        
        driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7']")).click();
        
        
        List<WebElement> list = driver.findElements(By.cssSelector("WebElement"));
        
        System.out.println(list.size());
        
        Iterator<WebElement> from = list.iterator();
        while(from.hasNext()) {
        	WebElement fr = from.next();
        	System.out.println(fr);
        }

        // Check if the list is not empty before performing further operations
        if (!list.isEmpty()) {
        	
            // Iterate through the list and print the text of each WebElement
            for (WebElement element : list) {
                System.out.println("Element Text: " + element.getText());
            }
        } else {
            System.out.println("No elements found matching the specified XPath.");
        }
        driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7']")).click();
        
 List<WebElement> list1 = driver.findElements(By.cssSelector("WebElement"));
        
        System.out.println(list1.size());
        
        Iterator<WebElement> to = list1.iterator();
        while(from.hasNext()) {
        	WebElement fr = to.next();
        	System.out.println(fr);
        }

      
        
        
        
        
        
        
        
        
        
        

      /*  // Find the input fields and send keys
       
        WebElement toInput = driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7']"));

       // Send keys to the input fields
        fromInput.sendKeys("Chennai, MAA - Chennai Airport, India");
        toInput.sendKeys("Bengaluru, BLR - Kempegowda International Airport");

       /* driver.findElement(By.xpath("(//input[@class=\"_1w3ZZo _2gKfhi _2mFmU7\"])[1]")).click();
        driver.findElement(By.xpath("(//button[@class=\"jkj0H4\"])[26]")).click();
        driver.findElement(By.xpath("(//input[@class=\"_1w3ZZo _2gKfhi _2mFmU7\"])[2]")).click();
        driver.findElement(By.xpath("(//button[@class=\"jkj0H4\"])[33]")).click();
       
        
        WebElement travelclass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Travellers | Class']")));
		Actions actions = new Actions(driver);
        actions.moveToElement(travelclass).click().perform(); 
        //action used for some click interaction that time used this will click exact one
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
		
		driver.findElement(By.xpath("//span[text()='SEARCH']")).click(); */
		
		
		//driver.quit();
     
      
    }
}
