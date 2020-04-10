package chainofresponsibility.hierarchy;

import chainofresponsibility.PayRiseRequest;

public class Supervisor extends DecisionMaker {
  private final DecisionMaker superior;

  public Supervisor(DecisionMaker superior) {
    this.superior = superior;
  }

  @Override
  public void handleRequest(PayRiseRequest payRiseRequest) {
    if (payRiseRequest.getPayRiseAmount() > 0.0 && payRiseRequest.getPayRiseAmount() < 2.0) {
      super.approveRequest(payRiseRequest, this);
    } else {
      if (superior != null) {
        superior.handleRequest(payRiseRequest);
      }
    }
  }
}