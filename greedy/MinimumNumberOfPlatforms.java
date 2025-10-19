package greedy;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {

    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int n = Arrival.length;

        int i = 1;
        int j = 0;

        int ans=1;
        int count = 1;

        while(i<n && j<n){
            if(Arrival[i]<=Departure[j]){
                i++;
                count++;
            } else {
                j++;
                count--;
            }
            ans = Math.max(ans,count);
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimumNumberOfPlatforms platforms = new MinimumNumberOfPlatforms();

        int[] arrival1 = {900, 940, 950, 1100, 1500, 1800};
        int[] departure1 = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(platforms.findPlatform(arrival1, departure1));

        int[] arrival2 = {900, 940};
        int[] departure2 = {910, 1200};
        System.out.println(platforms.findPlatform(arrival2, departure2));

        int[] arrival3 = {900, 940, 950};
        int[] departure3 = {910, 1200, 1120};
        System.out.println(platforms.findPlatform(arrival3, departure3));

        int[] arrival4 = {900};
        int[] departure4 = {910};
        System.out.println(platforms.findPlatform(arrival4, departure4));

        int[] arrival5 = {900, 940, 950, 1100};
        int[] departure5 = {910, 1200, 1120, 1130};
        System.out.println(platforms.findPlatform(arrival5, departure5));
    }

}
