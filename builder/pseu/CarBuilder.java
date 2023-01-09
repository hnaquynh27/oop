package builder.pseu;

public class CarBuilder implements Builder {
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }

    public Car getResult() {
        return new Car(seats, engine, tripComputer, gps);
    }
}