package task3.grootan;

import java.util.ArrayList;

public class Others implements Objects{
    private ArrayList<String> othersList = new ArrayList<>();
    ArrayList<String> classifyedList;
    Others(){
        classifyedList = new ArrayList<>();
    }

    @Override
    public boolean isAvailable(String object) {
        if(othersList.contains(object)){
            classifyedList.add(object);
            return true;
        }
        return false;
    }

    @Override
    public void addInBasket(String object) {
        classifyedList.add(object);
        othersList.add(object);
    }
}
