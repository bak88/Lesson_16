package org.example.Task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommunicationServices {

    private WebDriver driver;
    private By phoneNumberField = By.id("connection-phone");
    private By sumField = By.id("connection-sum");
    private By emailId = By.id("connection-email");
    private By continueButton = By.xpath("//button[text()='Продолжить']");

    public CommunicationServices(WebDriver driver) {
        this.driver = driver;

    }

    public void fillFields(String phoneNumber, String sum) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        driver.findElement(sumField).sendKeys(sum);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public String getPhoneNumber() {
        return driver.findElement(By.id("connection-phone")).getAttribute("value");

    }

    public String getSum() {
        return driver.findElement(By.id("connection-sum")).getAttribute("value");
    }

    public String getSumButton(){
        return driver.findElement(By.xpath("//button[@class='colored disabled']")).getAttribute("innerText");
    }

}
