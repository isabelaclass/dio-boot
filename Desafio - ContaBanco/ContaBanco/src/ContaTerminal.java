import java.util.Scanner;
public class ContaTerminal {
    /**
     * @author: Isabela Class
     * @description: This program creates a bank account to the user
     */
    public static void main(String[] args) throws Exception {
        try (Scanner reader = new Scanner(System.in)) {
            int accountNumber;
            String accountAgency;
            String clientName;
            float accountBalance;

            System.out.println("Hello, type your account number: ");
            accountNumber = reader.nextInt();

            System.out.println("Type your agency number: ");
            accountAgency = reader.next();

            System.out.println("Type your name: ");
            clientName = reader.next();

            System.out.println("Type your balance: ");
            accountBalance = reader.nextFloat();

            System.out.printf(String.format("Hello %s, thank you for creating a account in our bank! Your aggency is %s, your account is %d and your current balance is %.2f%n", clientName, accountAgency, accountNumber, accountBalance));
        }
    }
}
