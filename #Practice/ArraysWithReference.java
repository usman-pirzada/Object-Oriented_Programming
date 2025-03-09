public class ArraysWithReference {
    int[] createArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i+1;
        }

        System.out.println("\nArray of size " + size + " created successfully!");
        this.displayArray(arr);

        return arr;
    }

    int[] modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println("\nYour array has been modified successfully!");

        return arr;
    }

    void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        ArraysWithReference obj = new ArraysWithReference();

        int[] arr = obj.createArray(5);

        obj.modifyArray(arr);
        obj.displayArray(arr);
    }
}
