// Problem No.134 Gas Station LeetCode.
// import java.util.Scanner;
public class Gas_Station {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        int x = canCompleteCircuit(gas, cost);
        System.out.print(x);
    }
// Funstion starts from here.
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int tc = 0;
        int curr = 0;
        int si = 0;
        for (int i = 0; i < gas.length; i++) {
            tc = tc + gas[i] - cost[i];
            curr += gas[i] - cost[i];

            if (curr < 0) {
                curr = 0;
                si = i + 1;
            }
        }

        if (tc < 0) {
            return -1;
        }
        return si;
    }
}
