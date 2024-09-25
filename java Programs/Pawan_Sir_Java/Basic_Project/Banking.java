
import java.util.Scanner;

public class Banking {

    private double Balance= 100000;
    public void withdrawc(double withdraw){
        if(withdraw > Balance){
            System.out.println("Balance Low");
        }
        else{
            System.out.println("withdrawc Amount : ");
            Balance= Balance-withdraw;
        }

        Scanner sc=new Scanner(System.in);

        

        }
}}