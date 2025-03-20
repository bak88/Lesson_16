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
        Assertions.assertEquals("Номер абонента", homeInternet.getPhonePlaceholder());

    }

    @Test
    public void testSumPlaseholder() {
        homeInternet = new HomeInternet(driver);
        homeInternet.selectHomeInternet();
        Assertions.assertEquals("Сумма", homeInternet.getSumPlaceholder());
    }

    @Test
    public void testEmailPlaseholder() {
        homeInternet = new HomeInternet(driver);
        homeInternet.selectHomeInternet();
        Assertions.assertEquals("E-mail для отправки чека", homeInternet.getEmailPlaceholder());
    }
}
