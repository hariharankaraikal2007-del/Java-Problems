import java.util.*;
public class Longest_increasing_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
}}
