package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names =
        new ArrayList<>(
            Arrays.asList("Hercules", "bmw", "audi", "volkwagen", "banana", "apple", "pen"));
    Handler handler = new Handler();

    names.forEach(
        name -> {
          try {
            handler.addInClassifyList(name);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        });
    handler.printEveryThing();
  }
}
