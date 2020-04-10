package chainofresponsibility.hierarchy;

import chainofresponsibility.PayRiseRequest;

public class SectionSupervisor extends DecisionMaker {
  private final DecisionMaker superior;

  public SectionSupervisor(DecisionMaker superior) {
    this.superior = superior;
  }

  @Override
  public void handleRequest(PayRiseRequest payRiseRequest) {
    if (payRiseRequest.getPayRiseAmount() > 2.0 && payRiseRequest.getPayRiseAmount() < 5.0) {
      super.approveRequest(payRiseRequest, this);
    } else {
      if (superior != null) {
        superior.handleRequest(payRiseRequest);
      }
    }
  }
}