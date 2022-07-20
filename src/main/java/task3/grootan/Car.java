package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car implements Objects {
  private ArrayList<String> carList = new ArrayList<>(Arrays.asList("bmw", "volkwagen", "audi"));

  ArrayList<String> classifyedList;
  Car(){
    classifyedList = new ArrayList<>();
  }


  @Override
  public boolean isAvailable(String object) {
    if(carList.contains(object)){
      classifyedList.add(object);
      return true;
    }
    return false;
  }

  @Override
  public void addInBasket(String object) {
    carList.add(object);
  }
}
