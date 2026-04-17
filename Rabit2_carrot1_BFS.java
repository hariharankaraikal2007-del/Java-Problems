import java.util.*;
public class Rabit2_carrot1_BFS {
    static int[] dx = {-1,1,0,0,-1,-1,1,1};
    static int[] dy = {0,0,-1,1,-1,1,-1,1};
    public static  int BFS(char[][] grid,int ax,int ay,int R,int C){
        Queue<int[]>  queue=new LinkedList<>();
        boolean visited[][]=new boolean[R][C];
        visited[ax][ay]=true;
        queue.offer(new int[]{ax,ay,0});
        while(!queue.isEmpty()){
            int temp[]=queue.poll();
            int cx=temp[0];
            int cy=temp[1];
            int count=temp[2];
            if(grid[cx][cy]=='C')return count;
            for(int i=0;i<8;i++){
                int nx=cx+dx[i];
                int ny=cy+dy[i];
                if(nx>=0 && nx<R && ny>=0 && ny<C  && visited[nx][ny]==false && grid[nx][ny]!='#'){
                    queue.offer(new int[]{nx,ny,count+1});
                    visited[nx][ny]=true;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char grid[][]=new char[R][C];
        int ax=0,ay=0,bx=0,by=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                grid[r][c]=sc.next().charAt(0);
                if(grid[r][c]=='A'){
                    ax=r;
                    ay=c;
                }
                if(grid[r][c]=='B'){
                    bx=r;
                    by=c;
                }
            }
        }
        int dis_A=BFS(grid,ax,ay,R,C);
        int dis_B=BFS(grid,bx,by,R,C);
        if(dis_A==Integer.MAX_VALUE && dis_B==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else if(dis_A<dis_B){
            System.out.println("A");
        }
        else if(dis_A>dis_B){
            System.out.println("B");
        }
        else{
            System.out.println("A"+" "+"B");
        }
        sc.close();
    }
}
 