package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public int[][] insertNewInterval(int[][] Intervals, int[] newInterval) {
        //your code goes here

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = Intervals.length;

        while(i<n && Intervals[i][1] < newInterval[0]){
            result.add(Intervals[i]);
            i++;
        }

        while(i<n && Intervals[i][0] <= newInterval[1]){

            newInterval[0] = Math.min(Intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(Intervals[i][1],newInterval[1]);
            i++;
        }

        while(i<n){
            result.add(Intervals[i]);
            i++;
        }


        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        InsertInterval insertInterval = new InsertInterval();

        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        System.out.println(Arrays.deepToString(insertInterval.insertNewInterval(intervals1, newInterval1)));

        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        System.out.println(Arrays.deepToString(insertInterval.insertNewInterval(intervals2, newInterval2)));

        int[][] intervals3 = {};
        int[] newInterval3 = {5, 7};
        System.out.println(Arrays.deepToString(insertInterval.insertNewInterval(intervals3, newInterval3)));

        int[][] intervals4 = {{1, 5}};
        int[] newInterval4 = {2, 3};
        System.out.println(Arrays.deepToString(insertInterval.insertNewInterval(intervals4, newInterval4)));

        int[][] intervals5 = {{1, 5}};
        int[] newInterval5 = {6, 8};
        System.out.println(Arrays.deepToString(insertInterval.insertNewInterval(intervals5, newInterval5)));
    }

}
