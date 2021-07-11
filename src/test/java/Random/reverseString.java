package Random;

public class reverseString {

    public static void main(String[] args) {
      String input = "Hello";

      char [] temp = input.toCharArray();
        for (int i = temp.length-1; i >=0 ; i--) {
            System.out.print(temp[i]);
        }
    }
}
