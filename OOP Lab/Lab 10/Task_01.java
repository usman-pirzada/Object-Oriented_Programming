// Error Handling Best Practice

import java.util.ArrayList;

class Task_01 <T> {

    void calculate_avg(ArrayList<T> numList) {

        try {
            if(numList.isEmpty()) {
                numList.get(0); // Will throw IndexOutOfBound error when empty
            }


            int sum = 0, count = 0;

            for (T num : numList) {
                try {
                    if(num instanceof Integer) {
                        sum += (int) num;
                        count++;

                    } else if(num instanceof String) {
                        sum += Integer.parseInt((String) num);
                        count++;

                    } else {
                        System.out.println("Skipping non-numeric value in the arraylist: " + num);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid item in the arraylist: " + num);
                }
                
            }


            if(count > 0) {
                double avg = sum / count;
                System.out.println("The average of " + count + " numbers is: " + avg);
            } else {
                System.out.println("No integers found in the arraylist to calculate average!");
            }

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exeption: The ArrayList is null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutofBoundException: The ArrayList is empty!");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

    }

    ArrayList<T> createStringArraylist() {
        ArrayList<T> numList = new ArrayList<>();
        numList.add((T) "125");
        numList.add((T) "ijxsk");
        numList.add((T) "^$$%*$");
        numList.add((T) "224");
        return numList;
    }

    ArrayList<T> createIntegerArraylist() {
        ArrayList<T> numList = new ArrayList<>();
        numList.add((T) Integer.valueOf(354));
        numList.add((T) Integer.valueOf(324));
        numList.add((T) Integer.valueOf(384));
        return numList;
    }

    ArrayList<T> createMixedArraylist() {
        ArrayList<T> numList = new ArrayList<>();
        numList.add((T) Integer.valueOf(564));
        numList.add((T) "500");
        numList.add((T) "xyz");
        numList.add((T) Integer.valueOf(580));
        return numList;
    }

    ArrayList<T> createInvalidArraylist() {
        ArrayList<T> numList = new ArrayList<>();
        numList.add((T) "khi");
        numList.add((T) "ABC");
        numList.add((T) "XyZ");
        return numList;
    }

    ArrayList<T> createEmptyArraylist() {
        return new ArrayList<T>();
    }


    public static void main(String[] args) {
        Task_01 task = new Task_01<>();

        System.out.println("\nTesting with an Null ArrayList");
        task.calculate_avg(null);
        System.out.println();

        System.out.println("\nTesting with an Empty ArrayList");
        task.calculate_avg(task.createEmptyArraylist());
        System.out.println();

        System.out.println("\nTesting with an Invalid ArrayList");
        task.calculate_avg(task.createInvalidArraylist());
        System.out.println();

        System.out.println("\nTesting with an Mixed ArrayList");
        task.calculate_avg(task.createMixedArraylist());
        System.out.println();

        System.out.println("\nTesting with an String ArrayList");
        task.calculate_avg(task.createStringArraylist());
        System.out.println();

        System.out.println("\nTesting with an Integer ArrayList");
        task.calculate_avg(task.createIntegerArraylist());
        System.out.println();
    }

}
