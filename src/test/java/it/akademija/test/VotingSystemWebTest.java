package it.akademija.test;

import it.akademija.WebPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2/13/2017.
 */
public class VotingSystemWebTest extends VotingSystem {

    @Test
    public void testVotingSystemWeb() {
        homePage = new HomePage(driver);
        String actualTitle = homePage.getTitleOfPage();
        Assert.assertTrue(actualTitle.toUpperCase().contains("LIETUVOS RESPUBLIKOS SEIMO RINKIMAI"));
    }
}
