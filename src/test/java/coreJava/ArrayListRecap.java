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
        for(int i =0 ; i<list1.size() ; i++){

            for(int j = 0 ; j< list2.size() ;j++){

                if(list1.get( i ) == list2.get( j )){
                    System.out.println(list1.get( i ));
                }
            }
        }

//        Create one String arraylist apple , orange ,banana , orange
//                               orange to pineapple

        List<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange");

        for(int i=0;i<fruit.size() ; i++){

            if(fruit.get( i ).equals( "orange" )){
                fruit.set( i ,"pineapple");
            }

        }

        System.out.println(fruit);


//        Create one integer arraylist 1,4,7,6
//                     Second max in the arraylist

        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(1);
        list4.add(4);
        list4.add(7);
        list4.add(6);

        int max = 0;
        int secondMax = 0;

        for(int i = 0 ; i<list4.size() ; i++){

            if(list4.get( i )>max){
                secondMax = max;
                max = list4.get(i);
            }else if (list4.get( i )>secondMax){
                secondMax = list4.get( i );
            }

        }

        System.out.println("second max  = "+secondMax);

    }

}
