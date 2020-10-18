package HomeWork21102020.Enum;

public class Main {
    public static void main(String[] args) {
        Alphabet[] alphabet = Alphabet.values();

        for (int i = 0; i < alphabet.length; i++){
            System.out.println("Елемент: " + alphabet[i]);
            System.out.println("Его индекс: " + alphabet[i].getLetterPosition());
        }
    }
}
