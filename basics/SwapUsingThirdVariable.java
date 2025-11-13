public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println("a before swap:"+a+" b before swap "+b);
        int c;//temp variable
        c=a;
        a=b;
        b=c;
        c=0;
        System.out.println("a after swap: "+a+" b after swap: "+b);
    }
}
