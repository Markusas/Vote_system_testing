package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Marek on 2/6/2017.
 */
public class Administravimas {
    private WebDriver driver;

    @FindBy(id = "location1")
    private WebElement teritoriniaiVienetaiBtn;
    @FindBy(xpath ="//span[text()='Apygardų sąrašas']" )
    private WebElement terVienHeaderText;
    @FindBy(id = "location2")
    private WebElement apygarduKandidatai;
    @FindBy(id = "location3")
    private WebElement apylinkiuAtstovai;
    @FindBy(xpath = "//b[text()='RINKIMŲ APYLINKIŲ ATSTOVAI']")
    private WebElement apyAtsHeaderText;
    @FindBy(id = "location4")
    private WebElement politiniaiVienetai;
    @FindBy(xpath = "//span[text()='Partijų sąrašas']")
    private WebElement polVienHeaderText;
    @FindBy(id = "location5")
    private WebElement apylinkiuRezultatai;
    @FindBy(xpath = "//span[text()='Apylinkių rezultatai']")
    private WebElement apyRezHeaderText;

    public Administravimas(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkTeritoriniaiVienetaiBtn() {
        teritoriniaiVienetaiBtn.click();
        return terVienHeaderText.isDisplayed();
    }

    public boolean checkApygarduKandidatai() {
        apygarduKandidatai.click();
        return terVienHeaderText.isDisplayed();
    }

    public boolean checkApylinkiuAtstovai() {
        apylinkiuAtstovai.click();
        return apyAtsHeaderText.isDisplayed();
    }

    public boolean checkPolitiniaiVienetai() {
        politiniaiVienetai.click();
        return polVienHeaderText.isDisplayed();
    }

    public boolean checkApylinkiuRezultatai() {
        apylinkiuRezultatai.click();
        return apyRezHeaderText.isDisplayed();
    }
}

