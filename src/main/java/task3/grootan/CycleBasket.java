package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleBasket implements Baskets {
  private ArrayList<String> cycleList =
      new ArrayList<>(Arrays.asList("Hercules", "Atles", "RoadRider"));
  ArrayList<String> classifiedList;

  public CycleBasket() {
    classifiedList = new ArrayList<>();
  }

  @Override
  public void ifValueAvailableAddToList(String name) {
    if (cycleList.contains(name)) {
      Handler.otherClassesHaveTheName = 1;
      classifiedList.add(name);
    }
  }
}
