package Inheritance;

public class House {
    private int room;
    private double price;

    public House(int room, double price){
        this.room = room;
        this.price = price;
    }

    public boolean isNew(){
        return true;
    }
    public String toString(){
        return super.toString();
    }
}
