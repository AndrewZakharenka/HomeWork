package HomeWork07102020.Calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    {
        firstNumber = 0;
        secondNumber = 0;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void sum() {
        System.out.println("Sum = " + (this.firstNumber + this.secondNumber));
    }

    public void sub() {
        System.out.println("Subtraction = " + (this.firstNumber - this.secondNumber));
    }

    public void multiplication() {
        System.out.println("Multiplication = " + (this.firstNumber * this.secondNumber));
    }

}
