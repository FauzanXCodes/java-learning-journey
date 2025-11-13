public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 20,b=10;
        System.out.println("a before swap: "+a+" b before swap: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a after swap: "+a+" b after swap: "+b);
    }
}
