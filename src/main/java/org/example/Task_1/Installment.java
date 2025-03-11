package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Installment {

    private WebDriver driver;
    private By scoreId = By.id("score-instalment");
    private By sumId = By.id("instalment-sum");
    private By emailId = By.id("instalment-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By serviceOptionInstallment = By.xpath("//p[contains(text(), 'Рассрочка')]");

    public Installment(WebDriver driver) {
        this.driver = driver;
    }

    public String getScorePlaceholder(){
        return driver.findElement(scoreId).getAttribute("placeholder");
    }

    public String getSumPlaceholder(){
        return driver.findElement(sumId).getAttribute("placeholder");
    }

    public String getEmailPlaceholder(){
        return driver.findElement(emailId).getAttribute("placeholder");
    }

    public void selectInstallment() {
        Actions actions = new Actions(driver);

        WebElement header = driver.findElement(selectHeader);
        actions.moveToElement(header).click().perform();

        WebElement option = driver.findElement(serviceOptionInstallment);
        actions.moveToElement(option).click().perform();

    }
}
