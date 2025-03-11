package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommunicationServices {

    private WebDriver driver;
    private By phoneId = By.id("connection-phone");
    private By sumId = By.id("connection-sum");
    private By emailId = By.id("connection-email");
    // private By continueButton = By.xpath("//button[@class='button button__default ']");


    public CommunicationServices(WebDriver driver) {
        this.driver = driver;
    }

    public String getPhonePlaceholder() {
        return driver.findElement(phoneId).getAttribute("placeholder");
    }

    public String getSumPlaceholder(){
        return driver.findElement(sumId).getAttribute("placeholder");
    }

    public String getEmailPlaceholder(){
        return driver.findElement(emailId).getAttribute("placeholder");
    }
}
