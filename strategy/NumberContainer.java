package strategy;

public class NumberContainer {
  private int[] array;

  public NumberContainer(int size) {
    array = new int[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 1000);
    }
  }

  public void sort(SortingStrategy strategy) {
    int[] clone = this.array.clone();
    long start = System.currentTimeMillis();
    strategy.sort(clone);
    long end = System.currentTimeMillis();
    System.out.printf("Sorted using %s in %d milliseconds\n", strategy.getClass(), end -start);
  }

  public void print() {
    for (int i = 0; i < this.array.length; i++) {
      System.out.printf("%d, ", this.array[i]);
      if (i > 0 && i % 25 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }
}