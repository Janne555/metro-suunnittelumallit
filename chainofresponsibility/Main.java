package chainofresponsibility;

import chainofresponsibility.hierarchy.*;

public class Main {
  public static void main(String[] args) {
    DecisionMaker ceo = new CEO();
    DecisionMaker sectionSupervisor = new SectionSupervisor(ceo);
    DecisionMaker supervisor = new Supervisor(sectionSupervisor);

    Employee modest = new Employee("John the modest");
    Employee eager = new Employee("Jane the eager");
    Employee workaholic = new Employee("Bernadette the workaholic");

    supervisor.handleRequest(modest.makePayRiseRequest(1.0));
    supervisor.handleRequest(eager.makePayRiseRequest(3.0));
    supervisor.handleRequest(workaholic.makePayRiseRequest(5.0));
  }
}