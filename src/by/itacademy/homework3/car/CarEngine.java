package by.itacademy.homework3.car;

public enum CarEngine {
    B4204T26(1.9),
    G4KM_MPI(2.5),
    V6_TFSI(2.9),
    V8_TFSI(4.0),
    T6_AWD(1.9),
    T5(1.9);
    private final double engineVolume;

    CarEngine(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
