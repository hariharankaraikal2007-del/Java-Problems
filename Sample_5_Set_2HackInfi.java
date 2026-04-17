import java.util.*;
public class Sample_5_Set_2HackInfi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        Map<Character,Integer> map=new HashMap<>();
        int hcf=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            hcf=map.get(ch);

        }
        for(int b:map.values()){
            hcf=gcd(hcf,b);
        }
        System.out.println(hcf);
        sc.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

