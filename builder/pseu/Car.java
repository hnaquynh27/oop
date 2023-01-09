package builder.pseu;

public class Car {
    private final int seats;
    private final Engine engine;
    private final TripComputer tripComputer;
    private final GPS gps;
    private double fuel = 0;

    public Car(int seats, Engine engine,
               TripComputer tripComputer, GPS gps) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gps = gps;
    }


    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPS getGpsNavigator() {
        return gps;
    }
}
