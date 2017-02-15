package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/8/2017.
 */
public class TeritoriniaiVienetai {
    private WebDriver driver;
    private By teritoriniaiVienetaiBtn = By.id("location1");
    private By apygardosName = By.id("inputDistrictName");
    private By sukurtiBtn = By.xpath("//button[text()='Sukurti']");
    private By apygarda = By.xpath("//div[contains(text(), 'Alytaus')]");

    public TeritoriniaiVienetai(WebDriver driver) {
        this.driver = driver;
    }

    public String addApygarda() {
        driver.findElement(teritoriniaiVienetaiBtn).click();
        driver.findElement(apygardosName).sendKeys("Alytaus");
        driver.findElement(sukurtiBtn).click();
        return driver.findElement(apygarda).getText();
    }
}
