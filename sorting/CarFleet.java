package sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Leetcode #853
 * https://leetcode.com/problems/car-fleet/
 */

public class CarFleet {
    public static int getCarFleets(int target, int[] pos, int[] speed) {

        double[][] distTime = new double[pos.length][2];
        for (int i = 0; i < pos.length; i++) {
            int dist = target - pos[i];
            double time = (double) dist / speed[i];
            distTime[i] = new double[] {dist, time};
        }

        Arrays.sort(distTime, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return (int) (o1[0] - o2[0]);
            }
        });

        int fleets = 1;

        for (int i = 1, j = 0; i < distTime.length; i++) {

            if (distTime[j][1] < distTime[i][1]) {
                fleets++;
                j = i;
            }
        }

        return fleets;
    }

    public static void main(String[] args) {
        int target = 10;
        int[] position = {6, 8};
        int[] speed = {3, 2};
        System.out.println(getCarFleets(target, position, speed));
    }
}
