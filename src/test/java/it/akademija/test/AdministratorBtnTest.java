package it.akademija.test;

import it.akademija.WebPages.Administravimas;
import it.akademija.WebPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Marek on 2/14/2017.
 */
public class AdministratorBtnTest extends VotingSystem {

    @Test
    public void testAdministratorBtn() {
        administravimas = new Administravimas(driver);
        homePage = new HomePage(driver);
        homePage.clickAdministravimasBtn();
        Assert.assertTrue(administravimas.checkTeritoriniaiVienetaiBtn());
        Assert.assertTrue(administravimas.checkApygarduKandidatai());
        Assert.assertTrue(administravimas.checkApylinkiuAtstovai());
        Assert.assertTrue(administravimas.checkPolitiniaiVienetai());
        Assert.assertTrue(administravimas.checkApylinkiuRezultatai());


    }
}
