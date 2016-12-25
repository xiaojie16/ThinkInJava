package chapters15;

import chapters15.util.Generator;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author by kissx on 2016/10/6.
 */

class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String descr, double price) {
        this.id = id;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ",price: $" + price;
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random rand = new Random(47);

                @Override
                public Product next() {
                    return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000) + 0.99);
                }
            };
}

class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; ++i) {
            add(new Shelf(nProducts));
        }
    }
}

class CheckoutStand {
}

class Office {
}

public class Store extends ArrayList<Aisle> {

    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; ++i) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle a : this) {
            for (Shelf s : a)
                for (Product p : s) {
                    result.append(p);
                    result.append("\n");
                }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 1, 10));
    }
}
