package Random;

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    //write a program that outputs the string representation of numbers from 1 to n.
    //for numbers 3, print Fizz, for 5 print Buzz and for multiples of both 3 and 5 print FizzBuzz
    public static List fizzBuzz (int  n){
             List list = new ArrayList();

            for (int i = 0; i < n ; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    list.add("FizzBuzz");
                } else if (i %3 == 0){
                    list.add("Fizz");
                } else if (i%5 == 0 ){
                    list.add("Buzz");
                } else{
                    list.add((Integer.toString(i)));
                }

            }

        return list;
    }

    public static void main(String[] args) {
        System.out.println( fizzBuzz(100));

    }
}
