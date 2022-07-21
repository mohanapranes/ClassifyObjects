package task3.grootan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Handler {
  private CarBasket carBasket = new CarBasket();
  private FruitBasket fruitBasket = new FruitBasket();
  private CycleBasket cycleBasket = new CycleBasket();
  private OthersBasket othersBasket = new OthersBasket();
  List<Baskets> basketsList = new ArrayList<>();

  Handler() {
    basketsList.add(carBasket);
    basketsList.add(fruitBasket);
    basketsList.add(cycleBasket);
  }

  /*otherClassesHaveTheName value used for check if any classes have the name object, if they doesn't
   * name object will be go to Others class, it is static because of parallel stream, every classes ifValueAvailableAddToList
   * function run in many thread if that function found name object otherClassesHaveTheName will change to 1*/
  static int otherClassesHaveTheName = 0;

  void addInClassifyList(String name) throws InterruptedException {
    /*I stored objects of Car, Fruit, Cycle in a List, and use parallel streaming for search the name in all objects
    * using multi threading */
    otherClassesHaveTheName = 0;
    basketsList.stream()
        .parallel()
        .peek(itrClass -> itrClass.ifValueAvailableAddToList(name))
        .collect(Collectors.toList());
    if (otherClassesHaveTheName == 0) {
      othersBasket.addInOthers(name);
    }
  }

  void printEveryThing() {
    System.out.print("Car -> ");
    print(carBasket.classifiedList);
    System.out.print("Fruit -> ");
    print(fruitBasket.classifiedList);
    System.out.print("Cycle -> ");
    print(cycleBasket.classifiedList);
    System.out.print("Others -> ");
    print(othersBasket.classifiedList);
  }

  private void print(ArrayList<String> objectList) {
    objectList.forEach(name -> System.out.print(name + " "));
    System.out.println();
  }
}
