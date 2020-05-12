package Inheritance;

public class Inherited {
    public static void main(String[] args) {
        SingleHouse sh = new SingleHouse();
        System.out.println(sh.toString());

        Warehouse wh = new Warehouse();
        System.out.println(wh.employees);
    }
}
