package org.example.Task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    private WebDriver driver;
    private By cardNumberField = By.xpath("//label[contains(text(), 'Номер карты')]");
    private By expirationDateField = By.xpath("//label[contains(text(), 'Срок действия')]");
    private By cvcField = By.xpath("//label[contains(text(), 'CVC')]");
    private By holderField = By.xpath("//label[contains(text(), 'Имя держателя (как на карте)')]");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String placeholderCardNumber() {
        return driver.findElement(cardNumberField).getAttribute("outerText");
    }

    public String placeholderExpirationDate() {
        return driver.findElement(expirationDateField).getAttribute("outerText");
    }

    public String placeholderCVC() {
        return driver.findElement(cvcField).getAttribute("outerText");
    }

    public String placeholderHolderName() {
       return driver.findElement(holderField).getAttribute("outerText");
    }

}
