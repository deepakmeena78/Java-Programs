import java.util.Scanner;

interface Principal {
    public double principalm();
}

interface InterestRate {
    public double retrievalm();
}

class Loan implements Principal, InterestRate {
    private double principal;
    private double interest;

    public Loan(double principal, double interest) {
        this.principal = principal;
        this.interest = interest;
    }

    public double principalm() {
        return principal;
    }

    public double retrievalm() {
        return interest;
    }

    public double sum(int year) {
        return principal * interest * year;
    }
}

public class AScar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Value : ");
        double p = sc.nextDouble();

        System.out.println("Enter Interest : ");
        double d = sc.nextDouble();

        System.out.println("Enter Time Year : ");
        int t = sc.nextInt();

        if (p > 0.0 && 0.01 < d && d < 0.99 && 0 < t && t < 25) {
            System.out.println("Well Done Right Input ");
            Loan l = new Loan(p, d);
            l.principalm();
            l.retrievalm();
            System.out.print(l.sum(t));

        } else {
            System.out.println("Invalid Number : ");
        }

    }
}