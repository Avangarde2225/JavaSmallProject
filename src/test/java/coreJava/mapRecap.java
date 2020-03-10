package coreJava;

import java.util.HashMap;

public class mapRecap {

    /*

    map :

    map is storing with key and value pair.

    Set and list only values.

    map(key) doesnt allow duplicates
    map(value) allow duplicates

    accept one null key
    accept multiple null values

    use put keyword while adding keys and values

     */

    public static void main(String[] args) {

        HashMap<Integer , String> map1 = new HashMap<Integer, String>(  );

        map1.put( 1, "Apple" );
        map1.put( 2, "Orange" );
        map1.put( 3, "Apple" );
        map1.put( 4, "Apple" );

        System.out.println( map1.get( 1 ));

//        print by key
        for(Integer i1:map1.keySet()){
            System.out.println(i1);
        }

//        print by value
        for(String s1:map1.values()){
            System.out.println(s1);
        }

    }

/*

HomeWork 1:   find a unique element in the arraylist  Apple Orange Apple Apple
                    result should be Orange

HomeWork 2:  Most frequent characters
            String a = "aasssdddd";
            answer should be d
                    and count = 4

 */


}
