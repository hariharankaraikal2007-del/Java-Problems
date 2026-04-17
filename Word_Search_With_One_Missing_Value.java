import java.util.*;
public class Word_Search_With_One_Missing_Value {
    private static boolean Answer=false;
    private static int diff[][]={{-1,0},{0,-1},{-1,-1},{1,1},{0,1},{1,0},{-1,1},{1,-1}};
    private static void DFS(char[][] grid,String word,int Skipped,int R,int C,int r,int c,int index,boolean visited[][]){
        if(Skipped>=2){
            return;
        }
        if(index==word.length()-1){
            Answer=true;
            return;
        }
        for(int[] temp:diff){
            int adjR=r+temp[0];
            int adjC=c+temp[1];
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && visited[adjR][adjC]!=true){
                visited[adjR][adjC]=true;
                if(word.charAt(index+1)!=grid[adjR][adjC]){
                    DFS(grid,word,Skipped+1,R,C,adjR,adjC,index+1,visited);
                }
                else{
                    DFS(grid,word,Skipped,R,C,adjR,adjC,index+1,visited);
                }
                visited[adjR][adjC]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char grid[][]=new char[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                grid[r][c]=sc.next().charAt(0);
            }
        }
        boolean visited[][]=new boolean[R][C];
        String word=sc.next();
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==word.charAt(0)){
                    visited[r][c]=true;
                    DFS(grid,word,0,R,C,r,c,0,visited);
                    visited[r][c]=false;
                }
                else if(grid[r][c]==word.charAt(1)){
                  visited[r][c]=true;
                  DFS(grid,word,1,R,C,r,c,1,visited);
                  visited[r][c]=false;
                }
            }
        }
        if(Answer){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
