import java.util.Scanner;
public class UserIntroduction{
    public static void main(String[] args) {
        // Taking name, age, city from user → print introduction.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Name: ");
        String name = sc.nextLine(),city;
        System.out.println("Enter Your City");
        city = sc.nextLine();
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("INTRODUCTION");
        System.out.println("Your Name: "+name+"\n Your age : "+age+" \nYour city: "+city);

    }
}