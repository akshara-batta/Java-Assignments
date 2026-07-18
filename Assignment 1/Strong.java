import java.util.Scanner;
public class Strong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = N; i<=M; i++){
            int temp = i;
            int remainder = 0;
            int sum = 0;
            while(temp>0){
                remainder = temp%10;
            
            int fact = 1;
            for(int j = 1; j<=remainder; j++){
                fact *= j;
            }
            sum += fact;
            temp = temp/10;
            }

            if(i==sum){
                System.out.println(i);
            }
        }
    }
}