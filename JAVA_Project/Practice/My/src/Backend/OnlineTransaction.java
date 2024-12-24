package Backend;

import java.util.Scanner;

class Transaction {

    private int id;
    private double amount;

    public Transaction(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}

class RecipientTransaction extends Transaction {

    private String recipient;

    public RecipientTransaction(String recipient, int id, double amount) {
        super(id, amount);
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void Recipient() {
        System.out.println("Class : RecipientTransaction");
        System.out.println("Transaction ID : " + getId());
        System.out.println("Amount : " + getAmount());
        System.out.println("Recipient : " + getRecipient()+"\n\n");
    }
}

class MerchantTransaction extends Transaction {

    private String merchant;

    public MerchantTransaction(String merchant, int id, double amount) {
        super(id, amount);
        this.merchant = merchant;
    }

    public String getMerchant() {
        return merchant;
    }

    public void Merchant() {
        System.out.println("Class : MerchantTransaction");
        System.out.println("Transaction ID : " + getId());
        System.out.println("Amount : " + getAmount());
        System.out.println("Merchant : " + getMerchant()+"\n\n");
    }
}

class BillTypeTransaction extends Transaction {

    private String billType;

    public BillTypeTransaction(String billType, int id, double amount) {
        super(id, amount);
        this.billType = billType;
    }

    public String getBillType() {
        return billType;
    }

    public void BillType() {
        System.out.println("Class : BillTypeTransaction");
        System.out.println("Transaction ID : " + getId());
        System.out.println("Amount : " + getAmount());
        System.out.println("Merchant : " + getBillType());
    }
}

public class OnlineTransaction {

    public static void main(String[] args) {

        RecipientTransaction r = new RecipientTransaction("Raj", 101, 8600);
        r.Recipient();

        MerchantTransaction m = new MerchantTransaction("Ankit", 102, 2000);
        m.Merchant();

        BillTypeTransaction b = new BillTypeTransaction("Meena", 103, 3000);
        b.BillType();
    }
}
