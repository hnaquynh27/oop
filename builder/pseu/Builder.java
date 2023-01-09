package builder.pseu;

public interface Builder {
    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTripComputer(TripComputer tripComputer);

    void setGPS(GPS gps);
}
