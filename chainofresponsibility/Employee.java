package chainofresponsibility;

public class Employee {
  private final String name;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public PayRiseRequest makePayRiseRequest(double amount) {
    return new PayRiseRequest(amount, this);
  }
}