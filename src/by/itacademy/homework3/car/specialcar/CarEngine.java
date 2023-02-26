package by.itacademy.homework3.car.specialcar;

public enum CarEngine {
    ECO_BOOST_AWD(3.0),
    V8_POWER_STROKE(6.7),
    GAS_ENGINE(7.3),
    ;
    private final double engineVolume;

    CarEngine(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
