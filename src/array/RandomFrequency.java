package array;

public class RandomFrequency {
    public static void main(String[] args) {

        int[] randomNumbers = new int[10];

        System.out.println("100 random numbers are: ");
        for (int i = 0; i < 100; i++) {
            int temp = (int) (Math.random() * 10);
            System.out.print(temp + ", ");
            randomNumbers[temp]++;
        }

        System.out.println();

        int sum = 0;
        for (int i = 0; i < 10; i ++) {
            System.out.println("Frequency of " + i + " = " + randomNumbers[i]);
            sum += randomNumbers[i];
        }
        System.out.println("Sum of frequencies: " + sum);
    }
}
