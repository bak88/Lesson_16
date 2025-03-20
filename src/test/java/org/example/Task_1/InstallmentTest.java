package org.example.Task_1;


import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InstallmentTest extends WebDriverManadger {

    private Installment installment;

    @Test
    public void testScorePlaceholder() {
        installment = new Installment(driver);
        installment.selectInstllment();
        Assertions.assertEquals(installment.getScorePlaceholder(), "Номер счета на 44");
    }

    @Test
    public void testSumPlaceholder() {
        installment = new Installment(driver);
        installment.selectInstllment();
        Assertions.assertEquals(installment.getSumPlaceholder(), "Сумма");
    }

    @Test
    public void testEmailPlaceholder() {
        installment = new Installment(driver);
        installment.selectInstllment();
        Assertions.assertEquals(installment.getEmailPlaceholder(), "E-mail для отправки чека");
    }


}
