package greedy;

import java.util.Arrays;

public class AssignCookies {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        //your code goes here

        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int l = 0;
        int n = Student.length;
        int m = Cookie.length;
        int r = 0;

        while(l<n && r<m){
            if(Student[l]<=Cookie[r]){
                r+=1;
            }
            l+=1;
        }

        return r;

        
    }

    public static void main(String[] args) {
        // Example input
        int[] Student = {1, 2};
        int[] Cookie = {1, 2, 3};

        // Create a Solution object
        AssignCookies solution = new AssignCookies();

        // Call the findMaximumCookieStudents function
        int result = solution.findMaximumCookieStudents(Student, Cookie);

        // Output the result
        System.out.println("Number of students satisfied: " + result);
    }


}
