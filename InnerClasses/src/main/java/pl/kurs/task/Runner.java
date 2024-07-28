package pl.kurs.task;

public class Runner {
    public static void main(String[] args) {
        Trolley trolley = new Trolley();

        Product p1 = new Product("Manufacturer1", "Product1", 0.4, 10.0);
        Product p2 = new Product("Manufacturer2", "Product2", 0.5, 15.0);
        Product p3 = new Product("Manufacturer3", "Product3", 0.3, 7.5);
        Product p4 = new Product("Manufacturer4", "Product4", 1.0, 20.0);

        trolley.add(p1);
        trolley.add(p2);
        trolley.add(p3);
        trolley.add(p4);

        System.out.println("Total weight: " + trolley.getTotalWeight());
        System.out.println("Total price: " + trolley.getTotalPrice());
        System.out.println(trolley);
    }
}
