package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    protected String getPlaceholder(By locator) {
        return driver.findElement(locator).getAttribute("placeholder");
    }

    protected void clickElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

}
