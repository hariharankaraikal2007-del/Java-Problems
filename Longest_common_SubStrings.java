import java.util.*;
public class Longest_common_SubStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S1=sc.next();
        String S2=sc.next();
        int R=S1.length();
        int C=S2.length();
        int DP[][]=new int[R+1][C+1];
        int maxlen=0;
        for(int r=1;r<R+1;r++){
            for(int c=1;c<C+1;c++){
                if(S1.charAt(r-1)==S2.charAt(c-1)){
                    DP[r][c]=DP[r-1][c-1]+1;
                    maxlen=Math.max(maxlen,DP[r][c]);
                }
            }
        }
        for(int r=1;r<R+1;r++){
            for(int c=1;c<C+1;c++){
                if(DP[r][c]==maxlen){
                    int row=r;
                    System.out.println(S1.substring(row-DP[r][c],row));
                }
            }
        }
    }
}
