import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of rectangle: ");
        double length,width;
        length = sc.nextDouble();
        System.out.println("Enter Width of rectangle:");
        width  = sc.nextDouble();
        System.out.println("The area of rectangle is "+length*width);
    }
}
