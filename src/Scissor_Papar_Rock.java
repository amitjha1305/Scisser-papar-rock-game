
import java.util.Random;
import java.util.Scanner;

public class Scissor_Papar_Rock {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello %s\n Welcome in Scissor/Papar/Rock game \n ",name );
        System.out.println("scissor = 0 ; paper = 1;  rock = 2; ");

        int playerwon=0;
        int compwon=0;
        for (int i = 1; i < 6; i++) {
            int player = sc.nextInt();
            Random rand = new Random();
            int comp = rand.nextInt(3);

            if (player == 0) {
                System.out.println("scissors");
            } else if (player == 1) {
                System.out.println("paper");
            } else if (player == 2) {
                System.out.println("rock");
            }
            if (comp == 0) {
                System.out.println("scissors ");
            } else if (comp == 1) {
                System.out.println("paper");
            } else {
                System.out.println("rock");
            }
            if (comp == player) {
                System.out.println("play again");
            } else if (player == 0 && comp == 1 || player == 1 && comp == 2 || player == 2 && comp == 0) {
                System.out.println(name + " win");
                playerwon++;
            } else {
                System.out.println("comp win");
                compwon++;
            }
        }
    System.out.println("-----------------------------------------------------------");
        System.out.println("computer won "+compwon+" times ");
        System.out.println(name +" won "+playerwon+" times ");
        System.out.println("------------------------------------------------------");
        if(playerwon>compwon){
            System.out.println(name +" win the game ");
        }
        else if(playerwon<compwon){
            System.out.println("comp win the game");
        }
        else{
            System.out.println("match draw thanks you to play " );
        }
    }
}