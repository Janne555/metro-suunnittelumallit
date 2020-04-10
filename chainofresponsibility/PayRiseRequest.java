package chainofresponsibility;

public class PayRiseRequest {
  private final double payRiseAmount;
  private final Employee employee;

  public PayRiseRequest(double payRiseAmount, Employee employee) {
    this.payRiseAmount = payRiseAmount;
    this.employee = employee;
  }

  public Employee getEmployee() {
    return employee;
  }

  public double getPayRiseAmount() {
    return payRiseAmount;
  }
}