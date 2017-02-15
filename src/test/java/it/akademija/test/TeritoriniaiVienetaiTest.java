package it.akademija.test;

import it.akademija.WebPages.HomePage;
import it.akademija.WebPages.TeritoriniaiVienetai;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Marek on 2/15/2017.
 */
public class TeritoriniaiVienetaiTest extends VotingSystem{

    @Test
    public void testTeritoriniaiVienetaiToAddApygarda() {
        homePage = new HomePage(driver);
        teritoriniaiVienetai = new TeritoriniaiVienetai(driver);
        homePage.clickAdministravimasBtn();
        Assert.assertTrue(teritoriniaiVienetai.addApygarda().contains("Alytaus"));


    }
}
