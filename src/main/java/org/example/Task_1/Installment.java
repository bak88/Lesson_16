package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Installment {

    private WebDriver driver;

    private By scoreId = By.id("score-instalment");
    private By sumId = By.id("instalment-sum");
    private By emailId = By.id("instalment-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By serviceOptionInstallment = By.xpath("//p[text()='Рассрочка']");

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

    public void selectInstallment() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(selectHeader));
        header.click();

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(serviceOptionInstallment));
        option.click();

    }
}
