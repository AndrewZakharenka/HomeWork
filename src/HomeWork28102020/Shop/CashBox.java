package HomeWork28102020.Shop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class CashBox {
    private ArrayDeque<Customer> queue;

    public CashBox() {
        this.queue = new ArrayDeque<>();
    }

     public void addInQueue(Customer customer){
        this.queue.add(customer);
     }

    public ArrayDeque<Customer> getQueue() {
        return queue;
    }

    public void removeFromTheQueue(){
        this.queue.remove();
    }

    public void calculationQueue(){
        double finalPrice = 0;
        ArrayList<Product> products = this.queue.element().getProducts();
        for (Product product : products) {
            finalPrice += product.getPrice();
        }

        System.out.println(this.queue.element().toString());
        System.out.println("Итого к оплате: " + finalPrice + " руб.");

        removeFromTheQueue();

        if (this.queue.peek() != null){
            calculationQueue();
        } else {
            System.out.println("Вся очередь рассчитана!");
        }
    }
}
