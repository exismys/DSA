package general;

public class RemoveElement {
    public static int removeElement(int[] arr, int value) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                if (j == -1) j = i;
            } else {
                if (j != -1) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }
}
