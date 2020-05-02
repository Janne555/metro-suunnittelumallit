package facade;

public class CPU {
  public void freeze() {
    System.out.println("Freeze");
  }

  public void jump(long position) {
    System.out.printf("jump to %d\n", position);
  }

  public void execute() {
    Memory.printMem();
  }
}