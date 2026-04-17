import java.util.*;
public class Codeforces_div2_07_04_2026{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int arr[]=new int[N+2];
            for(int i=1;i<=N;i++){
                arr[i]=sc.nextInt();
            }
            int spi=sc.nextInt();
            arr[0]=arr[N+1]=arr[spi];
            int dp[]=new int[N+2];
            for(int i=1;i<spi;i++){
                dp[i]=dp[i-1]+(arr[i-1]==arr[i]?0:1);
            }
            for(int i=N;i>spi;i--){
                dp[i]=dp[i+1]+(arr[i]==arr[i+1] ? 0 : 1  );
            } 
            int steps=Math.max(dp[spi-1],dp[spi+1]);
            if(dp[spi+1]>dp[spi-1] && arr[spi]!=arr[spi+1]){
                steps++;
            }   
            else if(dp[spi+1]<dp[spi-1] && arr[spi]!=arr[spi-1]){
                steps++;
            } 
            System.out.println(steps);
        }
    }
}