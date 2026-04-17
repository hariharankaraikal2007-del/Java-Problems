import java.util.*; 
public class Minimum_path_required_to_collect_all_carrot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int grid[][]= new int[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                grid[row][col]=sc.nextInt();
            }
        }
        int DP[][]=new int[R][C];
        if(grid[R-1][C-1]==5){
            DP[R-1][C-1]=1;
        }
        else{
            DP[R-1][C-1]=0;
        }
        for(int i=0;i<R-1;i++){
            if(grid[i][0]==5 && grid[i+1]){

            }
        }
        
    }
}
