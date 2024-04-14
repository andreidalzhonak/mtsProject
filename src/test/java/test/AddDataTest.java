package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class AddDataTest extends BaseWithThreadLocalTest {

  @Test
  public void inputData() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    onlineReplenishmentWithoutCommission.addInformationInField();
    Assert.assertEquals(onlineReplenishmentWithoutCommission.getTextNumber(),
        "Оплата: Услуги связи Номер:375297777777");
  }
}
