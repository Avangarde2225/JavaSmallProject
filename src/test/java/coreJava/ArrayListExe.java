package coreJava;

import java.util.ArrayList;

public class ArrayListExe {
    private ArrayList<String> ingredients;

    public static void main(String[] args) {
        ArrayListExe food = new ArrayListExe();


        food.ingredients = new ArrayList<>();

        food.ingredients.add("onion");
        food.ingredients.add("butter");
        food.ingredients.add("oil");
        food.ingredients.add("meet");

        System.out.println(food.ingredients);
    }
}
