package task3.grootan;

import java.util.ArrayList;

public class OthersBasket {

  // it is not behave like other classes
  ArrayList<String> classifiedList;

  public OthersBasket() {
    classifiedList = new ArrayList<>();
  }

  // If all other classes didn't have the name of object, this function would be called
  public void addInOthers(String name) {
    classifiedList.add(name);
  }
}
