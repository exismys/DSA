package recursion;

public class TowerOfHanoi {
    public static void move(int n, char source, char aux, char dest) {
        if (n == 1) {
            System.out.println("Move 1 disk from " + source + " to " + dest);
            return;
        }
        move(n - 1, source, dest, aux);
        move(1, source, aux, dest);
        move(n - 1, aux, source, dest);
    }

    public static void main(String[] args) {
        move(1, 'A', 'B', 'C');
        System.out.println();
        move(2, 'A', 'B', 'C');
        System.out.println();
        move(3, 'A', 'B', 'C');
    }
}
