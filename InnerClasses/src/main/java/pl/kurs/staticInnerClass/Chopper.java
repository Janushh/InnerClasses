package pl.kurs.staticInnerClass;

public class Chopper {
    private String motorcycleName;
    private MotorcycleEngine motorcycleEngine;

    public Chopper(String motorcycleName) {
        this.motorcycleName = motorcycleName;
    }

    public Chopper(String motorcycleName, String engineName) {
        this.motorcycleName = motorcycleName;
        this.motorcycleEngine = new MotorcycleEngine(engineName);
    }

    public MotorcycleEngine getMotorcycleEngine() {
        return motorcycleEngine;
    }

    public static class MotorcycleEngine { // statyczna kalsa wewnętrzna (klasa zagnieżdżona)
        private String engineName;

        public MotorcycleEngine(String engineName) {
            this.engineName = engineName;
        }

        public String getEngineName() {
            return engineName;
        }
    }
}
