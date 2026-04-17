import java.util.*;
public class Hackinfi_07_04_2026_Easy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int c=sc.nextInt();
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            while(!stack.isEmpty() && stack.peek()%2==c%2){
                int m=stack.pop();
                c+=m;
            }
            stack.push(c);
        }
        System.out.println(stack.size());
    } 
}