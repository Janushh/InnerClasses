package pl.kurs.normalInnerClass;

public class Car {
    private String carName;
    private Engine engine;
    private double mileage;
    private double fuelLevel;

    public Car(String carName, double mileage, double fuelLevel) {
        this.carName = carName;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public Car(String carName, double fuelConsumption, String engineName, double mileage, double fuelLevel) {
        this.carName = carName;
        this.engine = new Engine(fuelConsumption, engineName);
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public void drive100km() {
        engine.consumeFuel();
        mileage += 100;
    }

    public class Engine { //klasa wewnętrzna
        private double fuelConsumption;
        private String engineName;

        public Engine(double fuelConsumption, String engineName) {
            this.fuelConsumption = fuelConsumption;
            this.engineName = engineName;
        }

        private void consumeFuel() {
            if (fuelConsumption > fuelLevel)
                throw new IllegalStateException();
            fuelLevel -= fuelConsumption;
        }
    }
}
