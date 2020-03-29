package tests;

import base.BasePage;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BasePage {

    @Test
    public void searchGoogle() {
        HomePage.setGoogleTextbox(driver,"Turkey");
        HomePage.searchTextboxClick(driver);
    }
}
