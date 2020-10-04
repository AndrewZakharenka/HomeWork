package HomeWork07102020.Bank;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Andrei", "Zakharenka", "Visa", "04.10.2023");
        Card card2 = new Card("Vadim", "Kosmachev", "Maestro", "04.10.2023");
        Card card3 = new Card("Maxim", "Krakov", "Belcart", "04.10.2023");

        card1.validationCard();
        card1.setBalance(34);
        System.out.println("Balance: " + card1.getBalance());
    }

}
