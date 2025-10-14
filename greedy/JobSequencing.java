package greedy;

import java.util.Arrays;

public class JobSequencing {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs,(a,b)->b[2]-a[2]);

        int n = Jobs.length;

        int maxDeadline = -1;

        for(int[] jobs : Jobs){
            if(jobs[1] > maxDeadline){
                maxDeadline = jobs[1];
            }
        }
        int[] hash = new int[maxDeadline];

        Arrays.fill(hash,-1);

        int count = 0;

        int totalProfit = 0;

        for(int i=0; i<n;i++){
            for(int j=Jobs[i][1]-1; j>=0;j--){
                if(hash[j]==-1){
                    count+=1;
                    hash[j]=Jobs[i][0];
                    totalProfit+=Jobs[i][2];
                    break;
                }
            }
        }

        return new int[]{count,totalProfit};

    }

    public static void main(String[] args) {
        JobSequencing jobSequencing = new JobSequencing();

        int[][] jobs1 = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};
        System.out.println(Arrays.toString(jobSequencing.JobScheduling(jobs1)));

        int[][] jobs2 = {{1, 2, 100}, {2, 1, 19}, {3, 2, 27}, {4, 1, 25}, {5, 1, 15}};
        System.out.println(Arrays.toString(jobSequencing.JobScheduling(jobs2)));

        int[][] jobs3 = {{1, 3, 35}, {2, 4, 30}, {3, 4, 25}, {4, 2, 20}, {5, 3, 15}};
        System.out.println(Arrays.toString(jobSequencing.JobScheduling(jobs3)));

        int[][] jobs4 = {{1, 1, 5}, {2, 1, 10}, {3, 1, 15}, {4, 1, 20}};
        System.out.println(Arrays.toString(jobSequencing.JobScheduling(jobs4)));

        int[][] jobs5 = {{1, 2, 50}, {2, 2, 60}, {3, 3, 20}, {4, 1, 30}};
        System.out.println(Arrays.toString(jobSequencing.JobScheduling(jobs5)));
    }
}
