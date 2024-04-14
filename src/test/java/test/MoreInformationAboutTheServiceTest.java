package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;
import pages.PageForInformation;

@Test(priority = 1)

public class MoreInformationAboutTheServiceTest extends BaseWithThreadLocalTest {

  public void clickButtonMoreAboutTheService() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    PageForInformation pageForInformation = new PageForInformation(driverManager.getDriver());
    onlineReplenishmentWithoutCommission.pageWithInformationAboutPayCard();
    Assert.assertEquals(pageForInformation.checkNamePage(), "Оплата банковской картой");
  }
}
