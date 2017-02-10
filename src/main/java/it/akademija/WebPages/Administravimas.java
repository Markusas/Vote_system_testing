package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/6/2017.
 */
public class Administravimas {
    private WebDriver driver;
    private  By teritoriniaiVienetaiBtn = By.id("teritoriniaiVienetai");


    public Administravimas(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getTeritoriniaiVienetaiBtn() {
        return driver.findElement(teritoriniaiVienetaiBtn).getText().contains("Teritoriniai vienetai");
    }
    public void clickTeritoriniaiVienetaiBtn() {
        driver.findElement(teritoriniaiVienetaiBtn).click();
    }


}

