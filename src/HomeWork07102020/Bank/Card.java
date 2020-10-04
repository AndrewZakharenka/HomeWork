package HomeWork07102020.Bank;

import java.util.Random;

public class Card {
    private int id;
    private String name;
    private String surname;
    private String numCard;
    private String cvv;
    private String viewCard;
    private String dateOff;
    private int balance;
    private static int counter = 1;

    public Card(String name, String surname, String viewCard, String dateOff) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.numCard = generationNumCard();
        this.cvv = generationCVV();
        this.viewCard = viewCard;
        this.dateOff = dateOff;
        this.balance = 0;
    }

    private String generationNumCard() {
        String id = String.valueOf(this.id);
        String numCard = "";
        for (int i = 1; i <= 16 - id.length(); i++) {
            numCard += "0";
        }
        return numCard += id;
    }

    private String generationCVV() {
        Random random = new Random();
        String cvv = "";
        for (int i = 1; i <= 3; i++) {
            cvv += String.valueOf(random.nextInt(10));
        }
        return cvv;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    //вроде понимание у меня есть,что такое локальный класс,но в рамках этой задачи иной реализации я придумать не смог)
    private interface CardReport {
        void verifyNumCard();

        void verifyViewCard();

        void verifyOwner();

        void verifyDateOff();

        void verifyCVV();
    }

    public void validationCard() {
        class Validation implements CardReport {

            @Override
            public void verifyNumCard() {
                if (numCard.length() < 16) {
                    System.out.println("Error! The number card length is equal to " + numCard.length());
                } else {
                    System.out.println("The number is correct");
                }
            }

            @Override
            public void verifyViewCard() {
                if (viewCard == "") {
                    System.out.println("Error! The card type is undefined!");
                } else {
                    System.out.println("View card - " + viewCard);
                }
            }

            @Override
            public void verifyOwner() {
                if (name == "" || surname == "") {
                    System.out.println("Error! It is impossible to verify the owner!");
                } else {
                    System.out.println("Name owner - " + name + " Surname owner - " + surname);
                }
            }

            @Override
            public void verifyDateOff() {
                if (dateOff == "") {
                    System.out.println("Error! Date not verified");
                } else {
                    System.out.println("Period of validity - " + dateOff);
                }
            }

            @Override
            public void verifyCVV() {
                if (cvv.length() < 3) {
                    System.out.println("Error! CVV incorrect!");
                } else {
                    System.out.println("CVV Correct");
                }
            }

        }
        Validation validation = new Validation();

        validation.verifyViewCard();
        validation.verifyNumCard();
        validation.verifyOwner();
        validation.verifyCVV();
        validation.verifyDateOff();
    }
}
