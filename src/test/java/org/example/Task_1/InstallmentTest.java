package org.example.Task_1;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InstallmentTest extends WebDriverManadger {
    private Installment installment;

    @Test
    public void testScorePlaceholder() throws InterruptedException {
        installment = new Installment(driver);
        installment.selectInstallment();
        String expectedPlaceholder = "Номер счета на 44";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("score-instalment")));
        Assertions.assertEquals(expectedPlaceholder, installment.getScorePlaceholder());
    }

    @Test
    public void testSumPlaseholder() throws InterruptedException {
        installment = new Installment(driver);
        installment.selectInstallment();
        String expectedPlaceholder = "Сумма";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instalment-sum")));
        Assertions.assertEquals(expectedPlaceholder, installment.getSumPlaceholder());
    }

    @Test
    public void testEmailPlaseholder() throws InterruptedException {
        installment = new Installment(driver);
        installment.selectInstallment();
        String expectedPlaceholder = "E-mail для отправки чека";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instalment-email")));
        Assertions.assertEquals(expectedPlaceholder, installment.getEmailPlaceholder());
    }
}
