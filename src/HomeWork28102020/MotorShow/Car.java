package HomeWork28102020.MotorShow;

public class Car {
    private String model;
    private String marka;
    private double price;

    public Car(String model, String marka, double price) {
        this.model = model;
        this.marka = marka;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", price=" + price +
                '}';
    }
}
