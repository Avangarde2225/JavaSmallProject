package Inheritance;

public class Inherited {
    public static void main(String[] args) {
        SingleHouse sh = new SingleHouse();
        System.out.println(sh.toString());

        Warehouse wh = new Warehouse(5, 20000.00);


        House h = new Warehouse(2, 3000.00);
        //System.out.println(h.toString());

    }
}
