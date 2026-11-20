void main() {
    int password = 6682;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your password: ");

    for (int i = 0; i <= 2; i++) {
        if (password == input.nextInt()) {
            System.out.println("Your password has been entered correctly");
            System.out.print("========= ATM =========\n" +
                    "1. Check Balance\n" +
                    "2. Deposit\n" +
                    "3. Withdraw\n" +
                    "4. Show Account Status\n" +
                    "5. Exit\n" +
                    "======================= \n ");
            Double bankAccount = 2500.75;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your umber: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(" Initial balance: " + bankAccount);
            }
            else if (choice == 2) {
                Scanner Deposit = new Scanner(System.in);
                System.out.print("Enter amount to deposit: ");
                double amount = Deposit.nextDouble();
                if (amount > 0) {
                    bankAccount = bankAccount + amount;
                    System.out.println("Initial balance: " + bankAccount);
                } else {
                    System.out.println("Invalid amount");
                }
            } else if (choice == 3) {
                Scanner Withdraw = new Scanner(System.in);
                System.out.println("Enter amount to withdraw: ");
                double amount = Withdraw.nextDouble();
                if (amount > 0 && amount < bankAccount) {
                    bankAccount = bankAccount - amount;
                    System.out.println("Your withdrawal was successful. Your current balance is: " + bankAccount);
                }
            } else if (choice == 4) {
                if (bankAccount >= 5000) {
                    System.out.println(" VIP Customer ");
                } else if (bankAccount < 4999.99 && bankAccount >= 1000) {
                    System.out.println(" Regular Customer ");
                } else if (bankAccount < 1000) {
                    System.out.println(" Low Balance ");
                }
            } else if (choice == 5) {
                System.out.println(" Thank you for using our ATM ");
            } else if (choice >= 6) {
                System.out.println(" Invalid option ");
            }
            break;
        } else if (i == 2) {
            System.out.println("Your account has been locked");
        } else {
            System.out.println("try again");
        }
    }
}


