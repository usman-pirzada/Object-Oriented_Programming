package CLassPractice;

public class GenericArrays {
    public static <V> void printArray(V[] elements) {
        for(V element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'O', 'O', 'P', ' ', 'J', 'A', 'V', 'A'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }
}