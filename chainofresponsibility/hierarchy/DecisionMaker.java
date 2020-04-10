package chainofresponsibility.hierarchy;

import chainofresponsibility.PayRiseRequest;

public abstract class DecisionMaker {
  public abstract void handleRequest(PayRiseRequest payRiseRequest);

  protected void approveRequest(PayRiseRequest payRiseRequest, DecisionMaker decisionMaker) {
    System.out.printf("I, the %s, hereby increase the pay of employee '%s' by %.2f percent\n", decisionMaker.getClass().getSimpleName(),
        payRiseRequest.getEmployee().getName(), payRiseRequest.getPayRiseAmount());
  }
}