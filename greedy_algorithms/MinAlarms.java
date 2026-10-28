import java.util.Scanner;

/**
 * Problem: Alarmmm
 * codechef link :https://www.codechef.com/START262D/problems/ALARMM
 * Topic: Greedy Algorithms / String Manipulation
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class MinAlarms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            int alarms = 0;
            int i = n - 1; // Right-to-left greedy approach
            
            while (i >= 0) {
                if (s.charAt(i) == '1') {
                    alarms++;
                    i = i - k - 1; // Jump past covered rooms
                } else {
                    i--;
                }
            }
            System.out.println(alarms);
        }
        sc.close();
    }
}
