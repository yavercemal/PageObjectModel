package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BasePage {
    public  String baseUrl = "https://www.google.com/";
    public WebDriver driver;

    @BeforeTest
    public  void setBaseUrl() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }
}
