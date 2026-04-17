import java.util.Scanner;
public class Maximum_carrot_collection_6_04_2026Dilver_Theorem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char grid[][]=new char[N][N];   
        int count_carrot=0; 
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                grid[r][c]=sc.next().charAt(0);
                if(grid[r][c]=='C')count_carrot++;
            }
        }
        int dp=new int[N+1][N+1];
        for(int r=N;r>0;r--){
            for(int c=1;c<=N;c++){
                int max_adj=Math.max(dp[r][c-1],dp[r][c+1]);
                boolean is_C=false;
                if(r==N && c==1){
                    if(grid[r][c]=='C')dp[r][c]=1;
                    else dp[r][c]=0;
                }
                else if(r==N){
                    max=dp[r][c-1];
                    if(grid[r][c-1]=='C' && grid[r][c]=='C')dp[r][c]=max;
                    else if(grid[r][c]=='C') dp[r][c]=max+1;
                    else dp[r][c]=max;
                }
                else if(c==1){
                    max=dp[r+1][c];
                    if(grid[r+1][c]=='C' && grid[r][c]=='C') dp[r][c]=max;
                    else if(grid[r][c]=='C') dp[r][c]=max+1;
                    else dp[r][c]=max;
                }
                else{
                    max=Math.max()
                }
            }
        }
    }
}
