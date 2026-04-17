import java.util.*;
public class FirstRabbit_to_reach_carrot {
    private static int Dis_R1=-1;
    private static int Dis_R2=-1;
    private static int[][] diff={{1,0},{0,1},{-1,0},{0,-1}};
    private static void DFS(int [][] grid,int r,int c,int R,int C,boolean[][]visited,int moved){
        if(r>=R || r<0|| c<0 || c>=C || visited[r][c] || grid[r][c]==-1)return;
        visited[r][c]=true;
        if(grid[r][c]==1){Dis_R1=moved;
            return;
        }
        if(grid[r][c]==2){
            Dis_R2=moved;
            return;
        }
        for(int adj[]:diff){
            int adjR=r+adj[0];
            int adjC=c+adj[1];
            DFS(grid,adjR,adjC,R,C,visited,moved+1);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        int grid[][]=new int[R][C];
        int Carrot_Possition[]={-1,-1};
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                grid[r][c]=sc.nextInt();
                if(grid[r][c]==5){
                    Carrot_Possition[0]=r;
                    Carrot_Possition[1]=c; 
                }               
            }
        }
        boolean visited[][]=new boolean[R][C];
        Dis_R1=-1;
        Dis_R2=-1;
        DFS(grid,Carrot_Possition[0],Carrot_Possition[1],R,C,visited,0);

        if(Dis_R1==-1 && Dis_R2 !=-1){
            System.out.println("Rabit2");
        }
        else if(Dis_R1!=-1 && Dis_R2 ==-1){
            System.out.println("Rabit1");
        }
        else if(Dis_R1!=-1 && Dis_R2 !=-1){
            if(Dis_R1==Dis_R2){
                System.out.println("Both");
            }
            else{
                System.out.println(Dis_R1<Dis_R2? "Rabbit1":"Rabbit2");
            }
        }
        else{
            System.out.println()
        }
    }
}
