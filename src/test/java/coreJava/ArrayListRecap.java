package coreJava;


import java.util.List;
import java.util.ArrayList;


public class ArrayListRecap {

    public static void main(String[] args) {

/*
       Arraylist                      vs                 array

       Arraylist is dynamic size               array is fixed size
       Arraylist has only objects              array has primitives and objects
                                               array can have multi-dimensions
       Arraylist is part of the collections     array is not
                                               Array is faster then arraylist

*/

        List<Integer> list1 = new ArrayList<Integer>(  );

        list1.add( 1 );
        list1.add( 2 );
        list1.add( 3 );
        list1.add( 4 );

        List<Integer> list2 = new ArrayList<Integer>(  );

        list2.add( 1 );
        list2.add( 5 );
        list2.add( 3 );
        list2.add( 7 );

//        print all the elements common in both arraylists

        
    }

}
