package array;

public class SecondLargestElement {
    public static int getSecondLargest(int[] array) {
        int largest = 0;
        int secondLargest = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] != largest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Largest: " + largest + " Second Largest: " + secondLargest);
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {10, 40, 20, 30, 60, 15, 31};
        System.out.println(getSecondLargest(array));
    }
}
