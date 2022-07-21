package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;

public class CarBasket implements Baskets {
  private ArrayList<String> carList = new ArrayList<>(Arrays.asList("bmw", "volkwagen", "audi"));

  ArrayList<String> classifiedList;

  public CarBasket() {
    classifiedList = new ArrayList<>();
  }

  @Override
  public void ifValueAvailableAddToList(String name) {
    if (carList.contains(name)) {
      Handler.otherClassesHaveTheName = 1;
      classifiedList.add(name);
    }
  }
}
