package pl.kurs.staticInnerClass;

public class StaticClassRuner {
    public static void main(String[] args) {
        Chopper moto1 = new Chopper("Chopper", "v2 1800");
        System.out.println(moto1.getMotorcycleEngine().getEngineName());
    }
}
