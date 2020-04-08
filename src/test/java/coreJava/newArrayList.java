package coreJava;

import java.util.ArrayList;
import java.util.Formatter;

public class newArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Yellow");
        colorList.add("Brown");
        colorList.add("Red");
        colorList.add("Black");
        System.out.println(colorList.size());

        for (String color:colorList) {
            System.out.println(color);
        }
        colorList.add(0,"Red");
        System.out.println(colorList);

        System.out.println(colorList.get(3));

        colorList.set(4, "Blue");
        System.out.println(colorList);

        ArrayList<String>colorList2 = new ArrayList<>();
        for (int i = colorList.size()-1;i>=0; i--) {
            String element = colorList.get(i);
            System.out.println(element);
        }
       colorList = colorList2;
        System.out.println(colorList);

    }

}
