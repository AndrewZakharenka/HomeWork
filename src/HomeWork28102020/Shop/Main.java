package HomeWork28102020.Shop;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.addProduct(new Product("Апельсин", 3.0));
        customer1.addProduct(new Product("Кофе", 5.0));
        customer1.addProduct(new Product("Чай", 3.50));

        Customer customer2 = new Customer();
        customer2.addProduct(new Product("Хлеб", 1.5));
        customer2.addProduct(new Product("Кофе", 10.0));
        customer2.addProduct(new Product("Приправы", 4.50));

        Customer customer3 = new Customer();
        customer3.addProduct(new Product("Молоко", 1.75));
        customer3.addProduct(new Product("Курица", 5.30));
        customer3.addProduct(new Product("Масло", 1.50));

        CashBox cashBox = new CashBox();
        cashBox.addInQueue(customer1);
        cashBox.addInQueue(customer2);
        cashBox.addInQueue(customer3);

        cashBox.calculationQueue();
    }
}
