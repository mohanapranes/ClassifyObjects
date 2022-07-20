package task3.grootan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hercules", "bmw", "audi", "volkwagen", "banana", "apple", "pen"));
        Handler handler = new Handler();
        names.stream().forEach(handler::addInClassifyList);
        handler.printEveryThing();
    }
}