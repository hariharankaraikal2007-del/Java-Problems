import java.util.*;
public class Rabit_Carrot_bfs{
    private static int nc;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        String[][] grid=new String[R][C];
        Queue<Integer[]> queue=new LinkedList<>();
        boolean found=false;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                grid[i][j]=sc.next();
                if(grid[i][j].equals("R")){
                    queue.offer(new Integer[]{i,j});
                }
            }
        }
        int diff[][]={{-1,1},{0,1},{1,0},{1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
        int count=0;
        while(!queue.isEmpty() && found==false){
            count++;
            int size=queue.size();
            for(int i=0;i<size;i++){
                Integer currin[]=queue.poll();
                for(int temp[]:diff){
                    int nr=currin[0]+temp[0];
                    nc = currin[1]+temp[1];
                    if(nr >= 0 && nc < C && nr < R && nc >= 0 && !grid[nr][nc].equals("B")){
                        queue.offer(new Integer[]{nr,nc});
                        if(grid[nr][nc].equals("C")){
                            found=true;
                            break;
                        }
                        grid[nr][nc]="B";    
                    }
                }
            }
        }
    if(!found)System.out.println(-1);
    else{
        System.out.println(count);
    }
    }
}
