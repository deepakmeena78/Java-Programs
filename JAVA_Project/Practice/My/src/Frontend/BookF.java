package Frontend;
import Backend.Book;
import java.util.Scanner;

public class BookF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Book Quantity");
        int size = Integer.parseInt(sc.nextLine());
        
        BookF arr []= new BookF[size];
        
        for(int i = 0;i < arr.length;i++){
            System.out.println("Enter Book Title : ");
            String title = sc.nextLine();
            
            System.out.println("Enter Author Name : ");
            String author = sc.nextLine();
            
            System.out.println("Enter Book Priec : ");
            double price = Double.parseDouble(sc.nextLine());
            
            System.out.println("Enter Book Quantity : ");
            int Quantity = Integer.parseInt();
        }
        
        
        
    }
}
