import java.math.BigDecimal;

/**
 * Created by alexanderhughes on 2/3/16.
 */
public class UserInput {        //this class holds methods that handle user input
    String name;
    String howMuch;
    String selection;
    double balance = 100.00;

    public void enterName() throws Exception {
        System.out.println("Please enter your name");
        name = Atm.scanner.nextLine();
        if(name.isEmpty()) {
            throw new Exception("User must enter a name.");
        }
        System.out.println("Welcome " + name);
    }

    public void enterSelection() throws Exception {     //takes user input
        System.out.println("Would you like to...");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel Transaction");
        System.out.println("Please enter the number corresponding to your selection...");

        selection = Atm.scanner.nextLine();
        if(selection.equals("1")) {             //prints the user's balance
            System.out.println("Your balance is $" + balance);
        }
        else if(selection.equals("2")) {        //allows user to withdraw
            System.out.println("How much much money would you like to withdraw?");
            howMuch = Atm.scanner.nextLine();
            double howMuchDouble = Double.valueOf(howMuch);  //converts money input howMuch from string to int
            if(howMuchDouble > balance) {        //float is bad for money
                throw new Exception("Insufficient funds!");
            }
            balance -= howMuchDouble;
            System.out.println("Please take your money.");
            System.out.println("Remaining balance = $" + String.format("%.2f", balance));  //forces it to print 2 decimal places for balance
        }
        else if(selection.equals("3")) {            //cancels transaction
            System.out.println("Thank you please come again.");
        }
        else {
            throw new Exception("Invalid Response!");
        }

    }

}
