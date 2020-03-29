package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebElement element = null;

    public static void setGoogleTextbox(WebDriver driver,String searchTextbox) {
        element = driver.findElement(By.name("q"));
        element.sendKeys(searchTextbox);
    }

    public static void searchTextboxClick(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
        element.click();
    }
}
