import java.util.Scanner;
public class Multiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        sc.close();
        for(int i=0; i<=N; i++){
            for(int j=0; j<=10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}