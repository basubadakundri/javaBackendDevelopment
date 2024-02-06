import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ResumeUpdater {

    // Credentials
	private static final String naukriUsername = "basubadakundri@gmail.com";
	private static final String naukriPassword = "Basu@3518";
	private static final String resumePath = "C:/Users/HP/downloads/BasavarajV16.pdf";

    @Scheduled(fixedRate = 3600000) // Run every hour (in milliseconds)
    public void updateResumePeriodically() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Naukri login page
            driver.get("https://www.naukri.com/nlogin/login");

            // Find and fill in the login form
            WebElement usernameField = driver.findElement(By.id("usernameField"));
            usernameField.sendKeys(naukriUsername);

            WebElement passwordField = driver.findElement(By.id("passwordField"));
            passwordField.sendKeys(naukriPassword);

            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
            loginButton.click();

            // Wait for login process to complete
            Thread.sleep(5000);

            // Navigate to Resume page
            driver.get("https://my.naukri.com/Profile/edit?id=&altresid");

            // Find and upload the resume file
            WebElement attachCV = driver.findElement(By.id("attachCV"));
            attachCV.sendKeys(new File(resumePath).getAbsolutePath());

            // Wait for resume to upload
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
