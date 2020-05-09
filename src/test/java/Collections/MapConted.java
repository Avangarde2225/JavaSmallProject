package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapConted {
    public static void main(String[] args) {
//        String soft = "Become a Software Developer in 1 Year!";
//        //String[] sep = soft.split(" ");
//        for (int i = 0; i <soft.length() ; i++) {
//            System.out.println(soft.charAt(i));
//
////            Set<String> hash = new HashSet<>();
////            hash.add(sep[i]);
////            System.out.print(hash);
//        }
        String sentence = "Hello";
        char [] chars = sentence.toCharArray();

        HashMap<Character, Integer> mello = new HashMap<>();

        for (char letter: chars) {

            System.out.println(letter);

            mello.put(letter, 0);
        }

        System.out.println(mello);

    }
}
