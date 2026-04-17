import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> ans=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=N-1;i>=0;i--){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans.add(arr[i]);
                    stack.push(arr[i]);
                }
                else{
                    ans.add(stack.peek());
                    stack.push(arr[i]);
                }    
        }
        for(int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }
    }
}
