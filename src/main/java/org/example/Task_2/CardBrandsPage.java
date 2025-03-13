package org.example.Task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class CardBrandsPage {
    private WebDriver driver;
    private WebDriverWait wait;


    private By visaIcon = By.xpath("//img[contains(@src, 'visa-system.svg')]");
    private By mastercardIcon = By.xpath("//img[contains(@src, 'mastercard-system.svg')]");
    private By belkartIcon = By.xpath("//img[contains(@src, 'belkart-system.svg')]");
    private By maestroIcon = By.xpath("//img[contains(@src, 'maestro-system.svg')]");
    private By mirIcon = By.xpath("//img[contains(@src, 'mir-system.svg')]");

    public CardBrandsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isVisaIconDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(visaIcon)).isDisplayed();
    }

    public boolean isMastercardIconDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mastercardIcon)).isDisplayed();
    }

    public boolean isBelkartIconDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(belkartIcon)).isDisplayed();
    }

    public boolean isMaestroIconDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(maestroIcon)).isDisplayed();
    }

    public boolean isMirIconDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mirIcon)).isDisplayed();
    }
}

