package it.akademija.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2/8/2017.
 */
public class TeritoriniaiVienetai {
    private WebDriver driver;

    @FindBy(id = "location1")
    private WebElement teritoriniaiVienetaiBtn;

    @FindBy(id = "input-district-name")
    private WebElement apygardosName;

    @FindBy(xpath = "//button[text()='Sukurti']")
    private WebElement sukurtiBtn;

    @FindBy(xpath = "//div[contains(text(), 'Alytaus')]")
    private WebElement apygarda;

    @FindBy(xpath = "//div[contains(@id, 'district-')]")
    List<WebElement> districtList;

    @FindBy(xpath = "//span[contains(text(), 'Šalinti apygardą')]")
    private WebElement deleteApygardaBtn;

    @FindBy(xpath = "//button[contains(text(), 'Patvirtinti')]")
    private WebElement patvirtintiBtn;

    @FindBy(xpath = "//button[contains(text(), 'Atšaukti')]")
    private WebElement atsauktiBtn;

    private String apygardosNameForTest;

    public TeritoriniaiVienetai(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String addApygarda() {
        teritoriniaiVienetaiBtn.click();
        apygardosName.sendKeys("Alytaus");
        sukurtiBtn.click();
        apygardosName.clear();
        return apygarda.getText();
    }

    public boolean addIncorrectApygarda() {
        boolean checkSize;
        int correctDistrictNumber = districtList.size();
        apygardosName.sendKeys("Alytu5");
        sukurtiBtn.click();
        apygardosName.clear();
        int incorrectDistrictNumber = districtList.size();
        if (correctDistrictNumber == incorrectDistrictNumber) {
            checkSize = true;
        } else {
            checkSize = false;
        }
        return checkSize;
    }

    public boolean deleteApygarda() {
        boolean checkOrApygardaDelete;
        System.out.println(districtList.size());
        apygardosNameForTest = districtList.get(districtList.size() - 1).getText();
        System.out.println(districtList.size());
        districtList.get(districtList.size() - 1).click();
        deleteApygardaBtn.click();
        patvirtintiBtn.click();
        System.out.println(districtList.size());
        if (apygardosNameForTest == districtList.get(districtList.size() - 1).getText()) {
            checkOrApygardaDelete = false;
        } else {
            checkOrApygardaDelete = true;

        }
        System.out.println("Apygarda " + apygardosNameForTest + " istrinta!");
        return checkOrApygardaDelete;

    }

    public boolean notDeleteApygarda() {
        boolean checkOrApygardaNotDelete;
        apygardosNameForTest = districtList.get(districtList.size() - 1).getText();
        districtList.get(districtList.size() - 1).click();
        deleteApygardaBtn.click();
        atsauktiBtn.click();
        String apygardosNameNotDelete = districtList.get(districtList.size() - 1).getText();
        if (apygardosNameForTest.equals(apygardosNameNotDelete)) {
            checkOrApygardaNotDelete = true;
            System.out.println("Apygarda " + apygardosNameForTest + " neistrinta!");
        } else {
            checkOrApygardaNotDelete = false;

        }

        return checkOrApygardaNotDelete;
    }
}
