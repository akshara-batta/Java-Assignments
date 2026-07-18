import java.util.Scanner;
public class Even{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int N = sc.nextInt();
        sc.close();

        for(int i=0; i<=N; i++){
            if(i%2==0){
                System.out.println(i+" -> Even");
            }
            else{
                System.out.println(i+ " -> Odd");
            }
        }
    }
}