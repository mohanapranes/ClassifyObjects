package task3.grootan;

import java.util.ArrayList;

public class Handler {
  private Car car = new Car();
  private Fruit fruit = new Fruit();
  private Cycle cycle = new Cycle();
  private Others others = new Others();
  void addInClassifyList(String object) {
    if (car.isAvailable(object)) {
      System.out.println("Car");
    } else if (fruit.isAvailable(object)) {
      System.out.println("Fruit");
    } else if (cycle.isAvailable(object)) {
      System.out.println("Cycle");
    } else {
      System.out.println("Others");
      others.addInBasket(object);
    }
  }
  void printEveryThing(){
    System.out.print("Car -> ");
    print(car.classifyedList);
    System.out.print("Fruit -> ");
    print(fruit.classifyedList);
    System.out.print("Cycle -> ");
    print(cycle.classifyedList);
    System.out.print("Others -> ");
    print(others.classifyedList);
  }
  private void print(ArrayList<String> objectList){
    objectList.forEach(name -> System.out.print(name+", "));
    System.out.println();
  }
}
