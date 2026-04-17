import java.util.*;
public class Rabit_Carrot_BFS2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char grid[][]=new char[R][C];
        Queue<int[]> queue=new LinkedList<>();
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                grid[r][c]=sc.next().charAt(0);
                if(grid[r][c]=='R'){
                    queue.offer(new int[]{r,c,0});
                }
            }
        }
        boolean found=false;
        int diff[][]={{-1,1},{0,1},{1,0},{1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
        while(!queue.isEmpty() && found==false){
            int temp[]=queue.poll();
            for(int t[]:diff){
                int nr=temp[0]+t[0];
                int nc=temp[1]+t[1];
                if(nr>=0 && nr<R && nc>=0 && nc<C && grid[nr][nc]!='B'){
                    queue.offer(new int[]{nr,nc,temp[2]+1});
                    if(grid[nr][nc]=='C'){
                        found=true;
                        System.out.println(temp[2]+1);
                        return;
                    }
                    grid[nr][nc]='B';
                }
            }
        }
        System.out.print(-1);
    }
}

