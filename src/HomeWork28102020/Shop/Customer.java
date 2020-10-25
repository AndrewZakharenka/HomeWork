package HomeWork28102020.Shop;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
    private ArrayList<Product> products;

    public Customer() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "products=" + products.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(products, customer.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
