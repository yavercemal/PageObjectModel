package tests;

import base.BasePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;


public class HomePageTest extends BasePage {

    @Test
    public void searchGoogle() throws IOException {
        HomePage.setGoogleTextbox(driver,"Turkey");
        HomePage.searchClick(driver);
    }
}
