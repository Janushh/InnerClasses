package pl.kurs.task;

public class Product {
    private String manufacturer;
    private String name;
    private double weight;
    private double price;

    public Product(String manufacturer, String name, double weight, double price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
