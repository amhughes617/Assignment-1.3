/**
 * Created by alexanderhughes on 2/3/16.
 */
public class UserInput {
    String name;
    String howMuch;
    String selection;

    public void enterName() throws Exception {
        System.out.println("Please enter your name");
        name = Atm.scanner.nextLine();
        if(name.isEmpty()) {
            throw new Exception("User must enter a name.");
        }
        System.out.println("Welcome " + name);
    }

    public void enterSelection() throws Exception {
        System.out.println("Would you like to...");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel Transaction");
        System.out.println("Please enter the number corresponding to your selection...");
        selection = Atm.scanner.nextLine();

        if(selection.equals("1")) {
            System.out.println("Your balance is $100.");
        }
        else if(selection.equals("2")) {
            System.out.println("How much much money would you like to withdraw?");
            howMuch = Atm.scanner.nextLine();
            int howMuchInt = Integer.valueOf(howMuch);
            if(howMuchInt > 100) {
                throw new Exception("Insufficient funds!");
            }
            System.out.println("Please take your money.");
        }
        else if(selection.equals("3")) {
            System.out.println("Thank you please come again.");
        }
        else {
            throw new Exception("Invalid Response!");
        }

    }

}