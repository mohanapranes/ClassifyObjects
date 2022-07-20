package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruit implements Objects{
    private ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("banana", "apple", "Grape"));
    ArrayList<String> classifyedList;
    Fruit(){
        classifyedList = new ArrayList<>();
    }

    @Override
    public boolean isAvailable(String object) {
        if(fruitList.contains(object)){
            classifyedList.add(object);
            return true;
        }
        return false;

    }

    @Override
    public void addInBasket(String object) {
        fruitList.add(object);
    }
}
