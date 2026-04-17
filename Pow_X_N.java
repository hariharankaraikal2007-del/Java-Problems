import java.util.*;
public class Pow_X_N {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        double half = myPow(x, n/2);
        if(n % 2 == 0){
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        Pow_X_N obj=new Pow_X_N();
        System.out.println(obj.myPow(x,n));   
    }
}