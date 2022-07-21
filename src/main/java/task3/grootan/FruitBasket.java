package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBasket implements Baskets {

  private ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("banana", "apple", "Grape"));
  ArrayList<String> classifiedList;

  public FruitBasket() {
    classifiedList = new ArrayList<>();
  }

  @Override
  public void ifValueAvailableAddToList(String name) {
    if (fruitList.contains(name)) {
      Handler.otherClassesHaveTheName = 1;
      classifiedList.add(name);
    }
  }
}
