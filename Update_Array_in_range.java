import java.util.*;
public class Update_Array_in_range{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int Nums[]=new int[N];
        int Query[][]=new int[Q][3];
        int DP[]=new int[N+2];
        for(int i=0;i<N;i++){
            Nums[i]=sc.nextInt();
        }
        for(int q=0;q<Q;q++){
            Query[q][0]=sc.nextInt();
            Query[q][1]=sc.nextInt();
            Query[q][2]=sc.nextInt();
            int R=Query[q][0];
            int C=Query[q][1]+1;
            DP[R]+=Query[q][2];
            DP[C]-=Query[q][2];
        }
        for(int idx=1;idx<=N;idx++){
            DP[idx]+=DP[idx-1];
        }
        for(int id=0;id<N;id++){
            System.out.println(DP[id+1]+Nums[id]);
        }
    }
}
