package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NMeetingsInOneRoom {

    static class MeetingComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
        return Integer.compare(a[1], b[1]);
        }
    }

    public int maxMeetings(int[] start, int[] end) {
        // your code goes here

        int n = start.length;

        List<int[]> meetings = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            meetings.add(new int[]{start[i],end[i]});
        }

        Collections.sort(meetings,new MeetingComparator());

        int limit = meetings.get(0)[1];
        int count = 1;

        for(int i=1;i<meetings.size();i++){
            int currentStart = meetings.get(i)[0];
            if(currentStart>limit){
                count++;
                limit=meetings.get(i)[1];
            }
        }


        return count;

    }

    public static void main(String[] args) {
        NMeetingsInOneRoom nMeetings = new NMeetingsInOneRoom();

        int[] start1 = {1, 3, 0, 5, 8, 5};
        int[] end1 = {2, 4, 6, 7, 9, 9};
        System.out.println(nMeetings.maxMeetings(start1, end1));

        int[] start2 = {1, 2, 3, 4, 5};
        int[] end2 = {2, 3, 4, 5, 6};
        System.out.println(nMeetings.maxMeetings(start2, end2));

        int[] start3 = {1, 3, 2, 5};
        int[] end3 = {2, 4, 3, 6};
        System.out.println(nMeetings.maxMeetings(start3, end3));

        int[] start4 = {1, 3, 0, 5, 8};
        int[] end4 = {2, 4, 6, 7, 9};
        System.out.println(nMeetings.maxMeetings(start4, end4));

        int[] start5 = {1, 3, 0};
        int[] end5 = {2, 4, 6};
        System.out.println(nMeetings.maxMeetings(start5, end5));
    }
}