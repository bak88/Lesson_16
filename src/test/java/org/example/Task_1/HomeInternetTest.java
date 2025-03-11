package org.example.Task_1;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeInternetTest extends WebDriverManadger {
    private HomeInternet homeInternet;

    @Test
    public void testPhonePlaceholder() {
        homeInternet = new HomeInternet(driver);
        homeInternet.selectHomeInternet();
        String expectedPlaceholder = "Номер абонента";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("internet-phone")));
        Assertions.assertEquals(expectedPlaceholder, homeInternet.getPhonePlaceholder());

    }

    @Test
    public void testSumPlaseholder() {
        homeInternet = new HomeInternet(driver);
        homeInternet.selectHomeInternet();
        String expectedPlaceholder = "Сумма";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-sum")));
        Assertions.assertEquals(expectedPlaceholder, homeInternet.getSumPlaceholder());
    }

    @Test
    public void testEmailPlaseholder() {
        homeInternet = new HomeInternet(driver);
        homeInternet.selectHomeInternet();
        String expectedPlaceholder = "E-mail для отправки чека";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-email")));
        Assertions.assertEquals(expectedPlaceholder, homeInternet.getEmailPlaceholder());
    }
}
