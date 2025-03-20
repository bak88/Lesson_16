package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Installment extends BasePage {

    private By scoreId = By.id("score-instalment");
    private By sumId = By.id("instalment-sum");
    private By emailId = By.id("instalment-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By serviceOptionInstallment = By.xpath("//p[text()='Рассрочка']");

    public Installment(WebDriver driver) {
        super(driver);
    }

    public String getScorePlaceholder(){
        return getPlaceholder(scoreId);
    }

    public String getSumPlaceholder(){
        return getPlaceholder(sumId);
    }

    public String getEmailPlaceholder(){
        return getPlaceholder(emailId);
    }

    public void selectInstllment(){
        clickElement(selectHeader);
        clickElement(serviceOptionInstallment);
    }
}
