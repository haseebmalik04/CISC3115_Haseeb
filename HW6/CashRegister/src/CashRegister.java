import java.util.Scanner;
import java.io.*;

class Money {
    private int cents;
    private static int transaction = 0;

    public int getCents() {
        return this.cents;
    }

    public Money() {
        this.cents = 0;
    }

    public Money(Scanner input) {
        String usMoney = input.next();
        this.cents = Integer.parseInt(usMoney.replace("$", "").replace(".", ""));
    }

    public String toString() {
        return "$" + cents / 100 + "." + (cents % 100 < 10 ? "0" + cents % 100 : cents % 100);
    }

    public boolean equals(Money money) {
        return this.cents == money.getCents();
    }

    public void add(Money money) {
        this.cents += money.getCents();
        transaction += money.getCents();
    }

    public static String getTransaction() {
        return "$" + transaction / 100 + "." + (transaction % 100 < 10 ? "0" + transaction % 100 : transaction % 100);
    }
}

public class CashRegister {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("balance"));
        Money initialBalance = new Money(input);

        System.out.println("Starting balance: " + initialBalance.toString());

        Scanner input2 = new Scanner(new File("transactions"));
        int count = 0;

        while (input2.hasNext()) {
            Money transaction = new Money(input2);
            initialBalance.add(transaction);
            count++;
        }

        System.out.println(count + " transactions");

        PrintWriter out = new PrintWriter(new File("balance"));
        out.println(initialBalance.toString());
        out.close();

        System.out.println("Transaction Total: " + Money.getTransaction());
        System.out.println("Closing balance: " + initialBalance.toString());
    }
}
