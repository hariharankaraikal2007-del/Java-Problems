import java.util.*;
public class EASY_FOOD_STAMPS{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            PriorityQueue<int[]> pq1=new PriorityQueue<>(Collections.reverseOrder((a,b)->a[0]-b[0]));
            int arr[]=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int value=sc.nextInt();
                arr[i]=value;
                pq1.add(new int[]{value,value}); 
            }
            for(int i=0;i<n;i++){
                map.put(arr[i],sc.nextInt());
            }
            int max=Integer.MIN_VALUE;
            int curr=0;
            while(m>0){
                int top[]=pq1.poll();
                int a=map.get(top[1]);
                curr+=top[0];
                top[0]-=a;
                pq1.offer(top);
                m--;
                max=Math.max(max,curr);

            }
            System.out.println(max);
            sc.close();        
        
        }
    }
