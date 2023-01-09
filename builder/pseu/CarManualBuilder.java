package builder.pseu;

public class CarManualBuilder implements Builder {
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
    public void setGPS(GPS gpsNavigator) {
        this.gps = gps;
    }

    public Manual getResult() {
        return new Manual(seats, engine, tripComputer, gps);
    }
}
