import java.util.*;
public class CODEFORCES_02_04_2026{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                int smaller = 0, greater = 0;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[i]) {
                        smaller++;
                    } else if (arr[j] > arr[i]) {
                        greater++;
                    }
                }
                result[i] = Math.max(smaller, greater);
            }
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
