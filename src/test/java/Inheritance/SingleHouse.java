package Inheritance;

public class SingleHouse extends House {
    private boolean backyard;
    private int floors;

    public SingleHouse(){
    this(true, 3,4,250000.00);
    }

    public SingleHouse(boolean by, int f, int room, double price){
        super(room, price);
        this.backyard = by;
        this.floors = f;
    }
    @Override
    public String toString(){
        return "SingleHouse";
    }
}
