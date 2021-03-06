package it.akademija.test;

import it.akademija.WebPages.Administravimas;
import it.akademija.WebPages.HomePage;
import it.akademija.WebPages.TeritoriniaiVienetai;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2/14/2017.
 */
public abstract class VotingSystem {
    WebDriver driver;
    HomePage homePage;
    Administravimas administravimas;
    TeritoriniaiVienetai teritoriniaiVienetai;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:9000");
    }
}
