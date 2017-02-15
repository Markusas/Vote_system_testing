package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/6/2017.
 */
public class Administravimas {
    private WebDriver driver;
    private By teritoriniaiVienetaiBtn = By.id("location1");
    private By terVienHeaderText = By.xpath("//span[text()='Apygardų sąrašas']");
    private By apygarduKandidatai = By.id("location2");
    private By apylinkiuAtstovai = By.id("location3");
    private By apyAtsHeaderText = By.xpath("//b[text()='RINKIMŲ APYLINKIŲ ATSTOVAI']");
    private By politiniaiVienetai = By.id("location4");
    private By polVienHeaderText = By.xpath("//span[text()='Partijų sąrašas']");
    private By apylinkiuRezultatai = By.id("location5");
    private By apyRezHeaderText = By.xpath("//span[text()='Apylinkių rezultatai']");

    public Administravimas(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkTeritoriniaiVienetaiBtn() {
        driver.findElement(teritoriniaiVienetaiBtn).click();
        return driver.findElement(terVienHeaderText).isDisplayed();
    }

    public boolean checkApygarduKandidatai() {
        driver.findElement(apygarduKandidatai).click();
        return driver.findElement(terVienHeaderText).isDisplayed();
    }

    public boolean checkApylinkiuAtstovai() {
        driver.findElement(apylinkiuAtstovai).click();
        return driver.findElement(apyAtsHeaderText).isDisplayed();
    }

    public boolean checkPolitiniaiVienetai() {
        driver.findElement(politiniaiVienetai).click();
        return driver.findElement(polVienHeaderText).isDisplayed();
    }

    public boolean checkApylinkiuRezultatai() {
        driver.findElement(apylinkiuRezultatai).click();
        return driver.findElement(apyRezHeaderText).isDisplayed();
    }
}

