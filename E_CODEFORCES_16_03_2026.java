import java.util.*;
public class E_CODEFORCES_16_03_2026{
    public static long digitSum(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] arrstr = new String[900000];
        long arrstr_digit_sum[]=new long[900000];
        for (int i = 1; i <= 900000; i++) {
            long value = digitSum(i);
            String val = "" + i + value;
            while (value >= 10) {
                value = digitSum(value);
                val += value;
            }
            arrstr[i - 1] = val;
            int index=0;
            for(String temp:arrstr){
                long sum=0;
                for(char c:temp.toCharArray()){
                    sum+=c-'0';
                }
            arrstr_digit_sum[index++]=sum;
            }
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long n=sc.nextLong();
            int freq[]=new int[10]; 
            int digit_Sum=0;
            while(n>0){
                digit_Sum+=n%10;
                freq[(int)n%10]++;
                n=n/10;
            }
            String read_ans="";
            for(int j=0;j<=900000;j++){
                if(digit_Sum-arrstr_digit_sum[j]==j+1){
                    read_ans+=arrstr[j];
                    break;                }
            }
            for(char c:read_ans.toCharArray()){
                freq[c-'0']--;
        }
        int num=0;
        for(int m=9;m>=0;m--){
            while(freq[m]>0){
                num=num*10+m;
                freq[m]--;
            }
        }
        System.out.println(Integer.toString(num)+read_ans);
    }
    sc.close();
}
}