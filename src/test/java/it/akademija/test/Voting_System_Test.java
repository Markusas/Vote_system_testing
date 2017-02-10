package it.akademija.test;

import it.akademija.WebPages.Administravimas;
import it.akademija.WebPages.ApygarduKandidatai;
import it.akademija.WebPages.HomePage;
import it.akademija.WebPages.TeritoriniaiVienetai;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2/6/2017.
 */
public class Voting_System_Test {
    WebDriver driver;
    HomePage homePage;
    Administravimas administravimas;
    TeritoriniaiVienetai teritoriniaiVienetai;
    ApygarduKandidatai apygarduKandidatai;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:9000");
    }

    @Test(priority = 0)
    public void webPageRunningTest() {
        homePage = new HomePage(driver);
        String actualTitle = homePage.getTitleOfPage();
        Assert.assertTrue(actualTitle.toUpperCase().contains("LIETUVOS RESPUBLIKOS SEIMO RINKIMAI"));
        homePage.clickAdministravimasBtn();

    }

    @Test(priority = 1)
    public void adminPanelTest() {
        administravimas = new Administravimas(driver);
        Assert.assertTrue(administravimas.getTeritoriniaiVienetaiBtn());
        administravimas.clickTeritoriniaiVienetaiBtn();
    }

    @Test(priority = 2)
    public void DistrictCountiesManagemntTest() {
        teritoriniaiVienetai = new TeritoriniaiVienetai(driver);
        Assert.assertEquals(teritoriniaiVienetai.getTextOfHeader(), "Apygardų sąrašas");
        teritoriniaiVienetai.clickApygarduKandidataiBtn();
    }

    @Test(priority = 3)
    public void candidatesManagmentPageTest() {
        apygarduKandidatai = new ApygarduKandidatai(driver);
        Assert.assertEquals(apygarduKandidatai.getTextOfHeader(), "Apygardų sąrašas");
        apygarduKandidatai.clickApylinkiuAtstovaiBtn();
    }
}
