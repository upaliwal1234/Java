import java.util.Scanner;

public class CB_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String st = sc.next();
        SubString(st);
    }

    public static void SubString(String s) {
        int count = 0;
        boolean[] visited = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String str = s.substring(i, j);
                long num = Long.parseLong(str);
                if (isCBNumber(num) == true && isVisited(visited, i, j - 1) == true) {
                    count++;
                    for (int k = i; k <= j - 1; k++) {
                        visited[k] = true;
                    }
                }

            }
        }
        System.out.println(count);
    }

    public static boolean isVisited(boolean[] visited, int i, int j) {
        for (int k = i; k <= j; k++) {
            if (visited[k] == true) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCBNumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
