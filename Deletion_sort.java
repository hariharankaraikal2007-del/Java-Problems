import java.util.*;
public class Deletion_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            boolean ans=true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(i==0)continue;
                else{
                    if(arr[i]<arr[i-1])ans=false;
                }
            }
            if(ans)System.out.println(n);
            else{
                System.out.println(1);
            }
        }
        
    }
}