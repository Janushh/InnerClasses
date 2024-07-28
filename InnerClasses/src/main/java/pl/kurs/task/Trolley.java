package pl.kurs.task;

import java.util.ArrayList;
import java.util.List;

public class Trolley {
    List<Product> trolley = new ArrayList<>();

    private final SmallTrolley smallTrolley = new SmallTrolley();

    public void add(Product p) {
        if (p.getWeight() < 0.5) {
            smallTrolley.addProduct(p);
        } else {
            trolley.add(p);
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Product p : trolley) {
            totalWeight += p.getWeight();
        }
        totalWeight += smallTrolley.getTotalWeight();
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product p : trolley) {
            totalPrice += p.getPrice();
        }
        totalPrice += smallTrolley.getTotalPrice();
        return totalPrice;
    }

    public static class SmallTrolley {
        private final List<Product> smallTrolley = new ArrayList<>();

        public void addProduct(Product p) {
            smallTrolley.add(p);
        }

        public double getTotalWeight() {
            double totalWeight = 0.0;
            for (Product p : smallTrolley) {
                totalWeight += p.getWeight();
            }
            return totalWeight;
        }

        public double getTotalPrice() {
            double totalPrice = 0.0;
            for (Product p : smallTrolley) {
                totalPrice += p.getPrice();
            }
            return totalPrice;
        }

    }


    @Override
    public String toString() {
        return "Trolley{" +
                "trolley=" + trolley +
                ", smallTrolley=" + smallTrolley +
                '}';
    }
}
