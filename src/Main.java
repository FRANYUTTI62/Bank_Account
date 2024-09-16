import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String client;
        String accountType = "Basic";
        double balance = 1500.00;
        double withdraw;
        double deposit;
        int var = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your client name: ");
        client = sc.nextLine();

        if (client.equalsIgnoreCase("tony stark")){
            System.out.println("Name: Tony Stark");
            System.out.printf("Account: %s\n", accountType);
            System.out.printf("Balance: $%.2f\n", balance);
            while (var != 9){

                System.out.println("""
                        *************************************************
                        ** Write down the number of the desired option **
                        1 - Check Balance
                        2 - Withdraw
                        3 - Deposit
                        9 - Exit
                        """);
                var = sc.nextInt();
                switch (var){
                    case 1:
                        System.out.printf("Your balance: $%.2f\n", balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw: ");
                        withdraw = sc.nextDouble();
                        if (withdraw > balance){
                            System.out.printf("Your balance: $%.2f (Unable to withdraw)\n", balance);
                        } else {
                            System.out.printf("Your new balance: $%.2f\n", balance -= withdraw);
                        }
                        break;
                    case 3:
                        System.out.println("Enter the amount to deposit: ");
                        deposit = sc.nextDouble();
                        System.out.printf("Your new balance: $%.2f\n", balance += deposit);
                        break;
                    case 9:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
            System.out.println("Thank you for using Bank Account!");
        } else {
            System.out.println("Can't find client, try again");
        }

    }
}