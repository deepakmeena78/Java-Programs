/*            
 *          A 
                  B C 
                D E F 
              G H I J 
            K L M N O
 */
public class Pattern5 {
    public static void main(String[] args) {

        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                if (i == 1 && j == 4) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= i; j++) {
                if (i > 1) {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
