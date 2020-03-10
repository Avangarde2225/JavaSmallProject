package coreJava;

import java.util.ArrayList;
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



/*

HomeWork 1:   find a unique element in the arraylist  Apple Orange Apple Apple
                    result should be Orange

HomeWork 2:  Most frequent characters
            String a = "aasssdddd";
            answer should be d
                    and count = 4

*/

//  Homework 1

    ArrayList<String> s1 = new ArrayList<String>(  );

    s1.add( "Apple" );
    s1.add( "Apple" );
    s1.add( "Banana" );
    s1.add( "Banana" );
    s1.add( "Orange" );



    String result12 = null;

    outerloop:
    for(int i=0; i<s1.size() ; i++ ){

        for(int j = 0; j<s1.size() ; j++){

            String i1 = s1.get( i );
            String j1 = s1.get( j );

            int size = s1.size()-1;

            System.out.println(i1 + " "+ j + " " + result12 + " --" + j1 );

            if(i == size && !i1.isEmpty()){
                result12 =s1.get( i );
                break;
            }else if( i==j ){
                continue;
            }else if(i1.equals( j1 )){
                continue outerloop;
            }else if(!i1.equals( j1) && j ==size){
                result12 = s1.get( i );
                break outerloop;
            }

        }

    }

        System.out.println("result == "+result12);

//   Homework 2

//        solution one
        String a = "aasssddddgggggg";

        char c1 = 0;
        int count = 0 ;
        int max = 0 ;

        for(int i = 0 ; i < a.length() ; i++){
            count = 0 ;
            for(int j = 0 ; j<a.length() ;j++){

                if(a.charAt( i ) == a.charAt( j )){
                    count++;
                }

                if(count > max ){
                    max = count;
                    c1 = a.charAt( i );
                }

            }

            System.out.println(c1);
            System.out.println(max);
        }


//        -------------------------

        String ab = "aasssddddgggggg";
        char[] ar=ab.toCharArray();
        int countA=0;
        int countS=0;
        int countD=0;

        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]=='a'){
                countA++;
            }else if(ar[i]=='s'){
                countS++;
            }else if(ar[i]=='d'){
                countD++;
            }
        }

        if(countA>countD && countA>countS){
            System.out.println("a = "+countA);
        }else if(countD>countA && countD>countS){
            System.out.println("d = "+countD);
        }else if (countS>countD && countS>countA){
            System.out.println("s = "+countS);
        }


    }

}
