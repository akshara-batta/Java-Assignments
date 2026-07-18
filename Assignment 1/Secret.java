import java.util.Scanner;
public class Secret{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = 27;
        System.out.println("Enter your first guess: ");
        int First = sc.nextInt();
        if(First == Num){
            System.out.println("COngratulations! Correct!");
        }
        else if(First>Num){
            System.out.println("Too High.");
            System.out.println("Enter your second guess.");
        }
        else if(First<Num){
            System.out.println("Too Low");
            System.out.println("Enter your second guess.");
        }
        int Second = sc.nextInt();
        if(Second==Num){
            System.out.println("You got it!");
        }
        else if(Second>Num){
            System.out.println("Too High Again");
            System.out.println("Enter your third guess.");
        }
        else if(Second<Num){
            System.out.println("Too Low Again");
            System.out.println("Enter your third guess.");
        }

        int Third = sc.nextInt();
        if(Third==Num){
            System.out.println("You got it finally!");
        }
        else if(Third>Num){
            System.out.println("Too High Againnn");
            System.out.println("Enter your fourth guess.");
        }
        else if(Third<Num){
            System.out.println("Too Low Againnn");
            System.out.println("Enter your fourth guess.");
        }

        int Fourth = sc.nextInt();
        if(Fourth==Num){
            System.out.println("You got it finally. Wow!");
        }
        else if(Fourth>Num){
            System.out.println("Too High Againnn. God");
            System.out.println("Enter your last guess.");
        }
        else if(Fourth<Num){
            System.out.println("Too Low Againnn. God");
            System.out.println("Enter your last guess.");
        }

        int Last = sc.nextInt();
        if(Last==Num){
            System.out.println("You got it finally. Wow! Took a lot of time");
        }
        else if(Last>Num){
            System.out.println("Still Too High! Try again next time. The number was 27.");
        }
        else if(Last<Num){
            System.out.println("Still Too Low! Try again next time. The number was 27.");
        }

        
    }
}