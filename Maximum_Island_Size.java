import java.util.*;
public class Maximum_Island_Size {
    private int dfs(int[][] grid,boolean bool[][], int r, int c, int id){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || bool[r][c]!=true || grid[r][c]!=0){
            return 0;
        }
        grid[r][c]=id;
        bool[r][c]=true;
        return 1+dfs(grid,bool,r+1,c,id)+dfs(grid,bool,r-1,c,id)+dfs(grid,bool,r,c+1,id)+dfs(grid,bool,r,c-1,id);
    }
    public int findMax(int grid[][],int R,int C,Map<Integer> map){
        for (int i = 0; i < arr.length; i++) {
            
            for(int j=0;j<C;j++){
                if()
            }
        }}

       }
    public  int largestIsland(int[][]grid){
        Map<Integer,Integer> map=new HashMap<>();
        int R=grid.length;
        int C=grid[0].length;
        boolean bool[][]=new boolean[R][C];
        int id=1;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==1){
                    int size=dfs(grid,bool,r,c,id++);
                    map.put(id-1,size);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int arr[][]=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(largestIsland(arr));

    }
}

