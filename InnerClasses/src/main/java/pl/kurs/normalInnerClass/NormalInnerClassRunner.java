package pl.kurs.normalInnerClass;

public class NormalInnerClassRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 200, 20);
        Car.Engine engine1 = car1.new Engine(15, "silnik");

        Car car2 = new Car("Ford", 15, "1.0 ecoboost", 300, 50);
        car2.drive100km();
    }
}