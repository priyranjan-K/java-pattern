public class PatternOne {

    /* *********
       ********
       *******
       ******
       *****
       ****
       ***
       **
       *        */

    public static void main(String[] args) {
        print(9);
    }

    private static void print(int height) {
        for (int i = height; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
