package testdata;

import models.AddInformationForPayments;
import net.datafaker.Faker;
import utils.FakeMessageGenerator;


public class PrepareAddInformationForPayments {

  public static AddInformationForPayments addInformationData() {
    return AddInformationForPayments
        .builder()
        .sum(String.valueOf(FakeMessageGenerator.generateSum()))
        .email(FakeMessageGenerator.generateEmail())
        .build();
  }
}
