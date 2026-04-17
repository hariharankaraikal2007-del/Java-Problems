import java.util.Scanner;
public class Find_subarray_sum_equals_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int left = 0;
        int sum = 0;
        int ans = 0;
        for(int right = 0; right < n; right++){
            sum += arr[right];
            while( sum>k && left <= right){
                sum -= arr[left];
                left++;
            }
            if(sum == k)
                ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}