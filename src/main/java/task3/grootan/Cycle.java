package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycle implements Objects{
    private ArrayList<String> cycleList = new ArrayList<>(Arrays.asList("Hercules", "Atles", "RoadRider"));
    ArrayList<String> classifyedList;
    Cycle(){
        classifyedList = new ArrayList<>();
    }

    @Override
    public boolean isAvailable(String object) {
        if(cycleList.contains(object)){
            classifyedList.add(object);
            return true;
        }
        return false;
    }

    @Override
    public void addInBasket(String object) {
        cycleList.add(object);
    }
}
