package strategy;

public class Main {
  public static void main(String[] args) {
    NumberContainer container = new NumberContainer(100000);
    container.sort(BubbleSort.INSTANCE);
    container.sort(InsertionSort.INSTANCE);
    container.sort(SelectionSort.INSTANCE);
  }
}