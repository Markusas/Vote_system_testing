package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/6/2017.
 */
public class HomePage {
    private WebDriver driver;
    private By titleOfPage = By.xpath("//div[@class='navBarTitle']");
    private By administravimasBtn = By.id("buttonAdministration");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleOfPage() {
        return driver.findElement(titleOfPage).getText();
    }

    public void clickAdministravimasBtn() {
        driver.findElement(administravimasBtn).click();
    }
}
