import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        // Simple Interest Formula --> SI = (p*r*t)/100
        // P->Intial Amount(Principal)
        // R->Anunal Interest Rate(Rate)
        // T->Duration of Loan(Time)
        double p,t;
        float r = 0.05f;//5 percent
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the principal Amount:");
        p = sc.nextDouble();
        System.out.println("Enter the Duration :");
        t = sc.nextDouble();
        System.out.println("The Calulated Interest is"+(p*r*t)/100);
    }
}
