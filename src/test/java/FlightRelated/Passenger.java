package FlightRelated;

public class Passenger {
    private double bagPerFee;
    private int checkedBags;
    private int freeBags;

    public Passenger(){

    }
    public Passenger(int freeBags){
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }
    public Passenger(int freeBags, int checkedBags){
        this(freeBags);
        this.checkedBags = checkedBags;

    }
    private Passenger(double bagPerFee){
        this.bagPerFee = bagPerFee;
    }

    public static void main(String[] args) {
        Passenger fred = new Passenger(2);
        System.out.println(fred.bagPerFee);

        Passenger john = new Passenger(2,3);
        System.out.println(john.bagPerFee);
    }



}
