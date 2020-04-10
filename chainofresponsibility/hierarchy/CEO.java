package chainofresponsibility.hierarchy;

import chainofresponsibility.PayRiseRequest;

public class CEO extends DecisionMaker {
  @Override
  public void handleRequest(PayRiseRequest payRiseRequest) {
    if (payRiseRequest.getPayRiseAmount() >= 5.0) {
      super.approveRequest(payRiseRequest, this);
    }
  }
}