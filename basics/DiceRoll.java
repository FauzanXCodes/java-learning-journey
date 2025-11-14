import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Dice Roll Game***********");
        System.out.println("Press q to exit");
        char c;
        c = sc.next().charAt(0);
        while (c != 'q') {
            int diceFace = r.nextInt(6)+1;
            System.out.println("Present diceFace is :"+diceFace);
            System.out.println("Want to exit the game press q");
            c = sc.next().charAt(0);
        }
        System.out.println("You Quit the Game.....");
    }
}
