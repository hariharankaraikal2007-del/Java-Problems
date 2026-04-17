import java.util.*;
public class Disjoint_Set {
    public static void union(int arr[],int a,int b){
        int x=find(arr,a);
        int y=find(arr,b);
        if(x!=y){
            arr[y]=x;
        }
    }
    public static int find(int arr[],int a){
        if(arr[a]==a)return a;
        return arr[a]=find(arr,arr[a]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=i;
        }
        int q=sc.nextInt();
        for(int j=0;j<q;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            union(arr,a,b);
        }
        for(int i=0;i<=n;i++){
            System.out.print(i+" "+arr[i]+"\n");
        }
        sc.close();
    }
}
