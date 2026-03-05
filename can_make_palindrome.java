import java.util.*;
public class can_make_palindrome {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String a=sc.next();
        int b=0;
        for(int i=0;i<a.length();i++){
            b=b^(1<<(a.charAt(i)-'a'));
        }
        if(b==0&&(b&(b-1))==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
     }
}

