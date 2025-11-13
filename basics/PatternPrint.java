public class PatternPrint {
    public static void main(String[] args) {
        char a = '*';
        // *
        // **
        // ***
        // ****
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print(a);
            }
        }
    }
}
