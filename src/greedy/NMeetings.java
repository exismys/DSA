package greedy;

import java.util.*;

public class NMeetings {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        System.out.println(getMaxMeetings(start, end));
    }

    private static int getMaxMeetings(int[] start, int[] end) {
        List<List<Integer>> meetings = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            meetings.add(Arrays.asList(start[i], end[i]));
        }
        Collections.sort(meetings, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1) < o2.get(1) ? -1 : 1;
            }
        });
        int count = 1;
        int endTemp = meetings.get(0).get(1);
        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).get(0) > endTemp) {
                count++;
                endTemp = meetings.get(i).get(1);
            }

        }
        return count;
    }
}
