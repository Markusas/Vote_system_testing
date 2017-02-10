package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/8/2017.
 */
public class TeritoriniaiVienetai {
    private WebDriver driver;

    private By textOfHeader = By.xpath("//div[@class='list-group-item active']/span");
    private  By apygarduKandidataiBtn = By.id("apygarduKandidatai");

    public TeritoriniaiVienetai(WebDriver driver) {
        this.driver = driver;
    }


    public String getTextOfHeader() {
        String HeaderText;
        try {
            HeaderText = driver.findElement(textOfHeader).getText();
        } catch (Exception e) {
            HeaderText = "";
             }
        return HeaderText;
    }
     public void clickApygarduKandidataiBtn() {
         driver.findElement(apygarduKandidataiBtn).click();
     }

}
