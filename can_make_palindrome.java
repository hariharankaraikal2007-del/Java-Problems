import java.util.*;
public class can_make_palindrome {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String a=sc.next();
        int b=0;
        for(int i=0;i<a.length();i++){
            b=b^(1<<(a.charAt(i)-'a'));
        }
        int count=0;
        while(b>0){
            if((b>>1 & 1)==1){
                count++;
            }
            b=b>>1;       
         }
        if(count<=1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
     }
}
