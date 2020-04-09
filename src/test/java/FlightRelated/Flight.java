package FlightRelated;

public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    private int totalCheckedBags;
    int maxCarryOns = seats * 2, totalCarryOns;


    {
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    public void add1Passenger() {
        if (hasSeating()) {
            passengers += 1;
        } else {
            handleTooMany();
        }
    }

    public void add1Passenger(int bags) {
        if (hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }

    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(int bags, int carryOns) {
        if (hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }


    private void handleTooMany() {
    }

    private boolean hasSeating() {
        return passengers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {

        return totalCarryOns + carryOns <= maxCarryOns;
    }

    public Flight() {
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

}

