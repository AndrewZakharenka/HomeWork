package HomeWork21102020.Generics;

public class ArrayAllTypes<T> {
    T[] array;

    public ArrayAllTypes(T[] array) {
        this.array = array;
    }

    public <T> T getArrayByIndex(int index) {
        return (T) this.array[index];
    }
}
