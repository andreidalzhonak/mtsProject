package test;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class ViewTextPlaceholderCommunicationServiceTest extends BaseWithThreadLocalTest {

  @Test
  public void isDisplayedTextPlaceholderCommunicationService() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    Assert.assertEquals(onlineReplenishmentWithoutCommission.phoneNumberCommunicationService(),
        "Номер телефона");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.sumCommunicationService(),
        "Сумма");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.emailCommunicationService(),
        "E-mail для отправки чека");

  }
}
