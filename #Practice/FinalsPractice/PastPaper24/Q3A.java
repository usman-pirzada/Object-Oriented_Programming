// Q3 -- Complete given code
package PastPaper24;

class A<T extends Number> {
    private T[] arr1;
    private T[] arr2;
    
    A(T[] arr1, T[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    T[] addArrays(T[] arr1, T[] arr2) {
        if (arr1.length != 10 || arr2.length != 10) {
            return null; // Arrays must be of size 10
        }

        T[] result = (T[]) new Double[10];
        for (int i = 0; i < 10; i++) {
            double sum = arr1[i].doubleValue() + arr2[i].doubleValue();
            result[i] = (T) ((Double) sum);
        }

        return result;
    }

    String addArrays(Character[] arr1, Character[] arr2) {  // As T extends Number, we can't use it to get Character
        if (arr1.length != 10 || arr2.length != 10) {
            return null; // Arrays must be of size 10
        }

        StringBuilder result = new StringBuilder();
        for (char c : arr1) {
            result.append(c);
        }
        for (char c : arr2) {
            result.append(c);
        }
        return result.toString();
    }


    public static void main(String[] args) {

        Double[] arr1Double = {1.0, 2.2, 5.1, 6.4, 9.7, 6.4, 8.7, 4.6, 8.2, 6.1};
        Double[] arr2Double = {0.1, 4.1, 1.5, 4.6, 7.9, 4.6, 7.8, 6.4, 2.8, 1.6};

        Character[] arr1Char = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        Character[] arr2Char = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};


        A<Double> myClass = new A<>(arr1Double, arr2Double);
        Double[] resultDouble = myClass.addArrays(arr1Double, arr2Double);

        String resultedString = myClass.addArrays(arr1Char, arr2Char);

        if (resultDouble != null) {
            System.out.print("\nResult of addition (Double): ");
            for (int i = 0; i < 10; i++) {
                System.out.print(resultDouble[i] + " ");
            }
        } else {
            System.out.println("\nArrays must be of size 10");
        }

        if (resultedString != null) {
            System.out.print("\nResulted String: ");
            System.out.print(resultedString);
        } else {
            System.out.println("\nArrays must be of size 10");
        }


    }

}