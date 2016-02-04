import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by alexanderhughes on 2/3/16.
 */
public class UserAccount {        //this class holds methods that handle user input
    String name;
    double balance;
    String selection;


    public void enterName() throws Exception {
        name = null;
        System.out.println("Please enter your name.");
        name = Atm.scanner.nextLine();
        if (name.isEmpty()) {
            throw new Exception("User must enter a name.");
        } else if (!Atm.accounts.containsKey(name)) {
            System.out.println("Would you like to create a new account? [y/n]");
            String makeAccount = Atm.scanner.nextLine();
            switch (makeAccount) {
                case "y":
                    Atm.accounts.put(name, balance);
                    System.out.println("Welcome " + name);
                    break;
                case "n":
                    System.out.println("Have a nice day!");
                    enterName();
                    break;
                default:
                    System.out.println("Incorrect Response");
                    enterName();
                    break;
            }
        }
        else {
            System.out.println("Welcome " + name);
            balance = Atm.accounts.get(name);
        }
    }



    public void enterSelection() throws Exception {     //takes user input
        System.out.println("Would you like to...");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Cancel Transaction");
        System.out.println("5. Delete Account");
        System.out.println("Please enter the number corresponding to your selection...");

        selection = Atm.scanner.nextLine();

        if(selection.equals("1")) {             //prints the user's balance
            System.out.println("Your balance is $" + String.format("%.2f", balance));
        }
        else if(selection.equals("2")) {
            System.out.println("How much money would you like to deposit?");
            String howMuch = Atm.scanner.nextLine();
            double howMuchDouble = Double.valueOf(howMuch);
            balance+= howMuchDouble;
        }
        else if(selection.equals("3")) {        //allows user to withdraw
            System.out.println("How much much money would you like to withdraw?");
            String howMuch = Atm.scanner.nextLine();
            double howMuchDouble = Double.valueOf(howMuch);  //converts money input howMuch from string to int
            if(howMuchDouble > balance) {        //float is bad for money
                throw new Exception("Insufficient funds!");
            }
            balance-= howMuchDouble;
            System.out.println("Please take your money.");
            System.out.println("Remaining balance = $" + String.format("%.2f", balance));  //forces it to print 2 decimal places for balance
        }
        else if(selection.equals("4")) {        //cancels transaction
            Atm.accounts.put(name, balance);
            System.out.println("Thank you please come again.");
        }
        else if(selection.equals("5")) {
            Atm.accounts.remove(name);
            //balance = 0.0;          //when i tried to remove balance from HashMap with remove(name, balance), it wouldn't work
            System.out.println("Your account has been deleted.");
        }
        else {
            throw new Exception("Invalid Response!");
        }

    }

}
