public class TryCode1d {
   public static void main(String[] args) {

      int tamp = 4;
      for (int i = 1; i <= 5; i++) {
         for (int j = 6 - i; j >= 1; j--) {
            System.out.print(j);
         }
         for (int j = 2; j <= tamp + 1; j++) {
            System.out.print(j);
         }
         tamp--;
         System.out.println();
      }

      // char ch ='B';
      // System.out.println("AAAAAA");
      // for(int i = 1;i<=6;i++){
      //    int temp = 1;
      //    for(int j =1;j<=temp +i;j++){
      //       System.out.print(j);
      //    }
      //    for(int j = 1;j<=6-i;j++){
      //       System.out.print(ch);
      //    }
      //    ch++;
      //    System.out.println();
      // }
   }
}
