/*
 * Assignment 3.
Create a parent class Bank with a method getInterestRate() that returns 0.
Create subclasses:
SBI that overrides getInterestRate() to return 5.
ICICI that overrides getInterestRate() to return 6.
Axis that overrides getInterestRate() to return 7.
In the Main class, demonstrate method overriding by calling getInterestRate() on different bank objects.

 */


class Bank {
    public int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    public int getInterestRate() {
        return 5;
    }
}

class ICICI extends Bank {
    public int getInterestRate() {
        return 6;
    }
}

class Axis extends Bank {
    public int getInterestRate() {
        return 7;
    }
}

public class ASBankSAccounts {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        System.out.println("SBI : " + sbi.getInterestRate());

        Bank icic = new ICICI();
        System.out.println("ICICI : " + icic.getInterestRate());

        Bank axis = new Axis();
        System.out.println("Axis : " + axis.getInterestRate());
    }
}
