/**
 * Created by alexanderhughes on 2/4/16.
 */
public class BalanceMgmt {
    public void enterSelection() throws Exception {     //takes user input
        System.out.println("Would you like to...");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Cancel Transaction");
        System.out.println("5. Delete Account");
        System.out.println("Please enter the number corresponding to your selection...");

        UserAccount.selection = Atm.scanner.nextLine();

        if(UserAccount.selection.equals("1")) {             //prints the user's balance
            System.out.println("Your balance is $" + String.format("%.2f", UserAccount.balance));
        }
        else if(UserAccount.selection.equals("2")) {
            System.out.println("How much money would you like to deposit?");
            String howMuch = Atm.scanner.nextLine();
            double howMuchDouble = Double.valueOf(howMuch);
            UserAccount.balance+= howMuchDouble;
        }
        else if(UserAccount.selection.equals("3")) {        //allows user to withdraw
            System.out.println("How much much money would you like to withdraw?");
            String howMuch = Atm.scanner.nextLine();
            double howMuchDouble = Double.valueOf(howMuch);  //converts money input howMuch from string to int
            if(howMuchDouble > UserAccount.balance) {        //float is bad for money
                throw new Exception("Insufficient funds!");
            }
            UserAccount.balance-= howMuchDouble;
            System.out.println("Please take your money.");
            System.out.println("Remaining balance = $" + String.format("%.2f", UserAccount.balance));  //forces it to print 2 decimal places for balance
        }
        else if(UserAccount.selection.equals("4")) {        //cancels transaction
            Atm.accounts.put(UserAccount.name, UserAccount.balance);
            System.out.println("Thank you please come again.");
        }
        else if(UserAccount.selection.equals("5")) {
            Atm.accounts.remove(UserAccount.name);
            //balance = 0.0;          //when i tried to remove balance from HashMap with remove(name, balance), it wouldn't work
            System.out.println("Your account has been deleted.");
        }
        else {
            throw new Exception("Invalid Response!");
        }

    }

}

