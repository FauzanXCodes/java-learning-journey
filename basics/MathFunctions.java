import java.util.*;
public class MathFunctions {
    public static void main(String[] args){
        // There are many functions of math in java we are implementing some of them
        int a=10,b=30,c=20;
        System.out.println("The Maximum value is amoung "+a+b+c);
        int max=Math.max(a, b);
        max=Math.max(max,c);
        System.out.println(max);
        System.out.println("The Mimimum value is amoung "+a+b+c);
        int min = Math.min(a,b);
        min = Math.min(min,c);
        System.out.println(min);
        int x = -50;
        System.out.println(x+" Absolute Value is "+Math.abs(x));
        
    }
}
