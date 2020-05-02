package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = IntStream.range(0, 20).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
    Iterator<Integer> iterator1 = list.iterator();
    Iterator<Integer> iterator2 = list.iterator();
    Iterator<Integer> iterator3 = list.iterator();

    Thread ownIterator1 = new Thread(() -> {
      StringBuilder builder = new StringBuilder();
      while (iterator1.hasNext()) {
        builder.append(iterator1.next());
        builder.append(", ");
      }

      // iterator1.forEachRemaining(i -> {
      //   builder.append(i);
      //   builder.append(", ");
      // });

      System.out.printf("ownIterator1: %s\n", builder.toString());
    });

    Thread ownIterator2 = new Thread(() -> {
      StringBuilder builder = new StringBuilder();
      while (iterator2.hasNext()) {
        builder.append(iterator2.next());
        builder.append(", ");
      }

      // iterator2.forEachRemaining(i -> {
      //   builder.append(i);
      //   builder.append(", ");
      // });

      System.out.printf("ownIterator2: %s\n", builder.toString());
    });

    Thread sharedIterator1 = new Thread(() -> {
      StringBuilder builder = new StringBuilder();
      while (iterator3.hasNext()) {
        builder.append(iterator3.next());
        builder.append(", ");
      }

      // iterator3.forEachRemaining(i -> {
      //   builder.append(i);
      //   builder.append(", ");
      // });

      System.out.printf("sharedIterator1: %s\n", builder.toString());
    });

    Thread sharedIterator2 = new Thread(() -> {
      StringBuilder builder = new StringBuilder();

      while (iterator3.hasNext()) {
        builder.append(iterator3.next());
        builder.append(", ");
      }

      // iterator3.forEachRemaining(i -> {
      //   builder.append(i);
      //   builder.append(", ");
      // });

      System.out.printf("sharedIterator2: %s\n", builder.toString());
    });

    Thread disruptor = new Thread(() -> {
      list.remove(50);
    });

    ownIterator1.start();
    ownIterator2.start();
    sharedIterator1.start();
    sharedIterator2.start();
    // disruptor.start(); ConcurrentModificationException
  }
}