package org.example.Task_1;


import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommunicationServicesTest extends WebDriverManadger {
    private CommunicationServices communicationServices;

    @Test
    @DisplayName("Тест плейсхолдера телефона")
    public void testPhonePlaceholder() {
        communicationServices = new CommunicationServices(driver);
        String expectedPlaceholder = "Номер телефона";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        Assertions.assertEquals(expectedPlaceholder, communicationServices.getPhonePlaceholder());

    }

    @Test
    @DisplayName("Тест плейсхолдера сумма")
    public void testSumPlaseholder() {
        communicationServices = new CommunicationServices(driver);
        String expectedPlaceholder = "Сумма";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-sum")));
        Assertions.assertEquals(expectedPlaceholder, communicationServices.getSumPlaceholder());
    }

    @Test
    @DisplayName("Тест плейсхолдера имейл")
    public void testEmailPlaseholder() {
        communicationServices = new CommunicationServices(driver);
        String expectedPlaceholder = "E-mail для отправки чека";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-email")));
        Assertions.assertEquals(expectedPlaceholder, communicationServices.getEmailPlaceholder());
    }


}
