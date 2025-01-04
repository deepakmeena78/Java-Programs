import java.util.Scanner;

interface NumberInput {
    int getInput();
}

interface AutomorphicChecker {
    boolean isAutomorphic(int n);
}

class AutomorphicNumber implements NumberInput, AutomorphicChecker {

    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean isAutomorphic(int n) {
        int square = n * n;
        String numberStr = String.valueOf(n);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numberStr);
    }
}

public class AS_automorphic {
    public static void main(String[] args) {
        AutomorphicNumber automorphicNumber = new AutomorphicNumber();

        System.out.print("Enter a number: ");
        int n = automorphicNumber.getInput();

        if (automorphicNumber.isAutomorphic(n)) {
            System.out.println(n + " is an automorphic number");
        } else {
            System.out.println(n + " is not an automorphic number");
        }
    }
}