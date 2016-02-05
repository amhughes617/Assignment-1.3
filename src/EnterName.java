/**
 * Created by alexanderhughes on 2/5/16.
 */
public class EnterName {
    public void enterName(UserAccount account) throws Exception {       //accepts user input to login and create accounts
        account.name = null;
        System.out.println("Please enter your name.");
        account.name = account.scanner.nextLine();
        if (account.name.isEmpty()) {       //requires input or program will throw exception
            throw new Exception("User must enter a name.");
        } else if (!account.accounts.containsKey(account.name)) {   //checks if input does not match account key in accounts
            System.out.println("Would you like to create a new account? [y/n]");
            String makeAccount = account.scanner.nextLine();
            switch (makeAccount) {  // allows user to decide to create new account or not
                case "y":
                    account.accounts.put(account.name, account.balance);
                    System.out.println("Welcome " + account.name);
                    break;
                case "n":
                    System.out.println("Have a nice day!");
                    enterName(account); //will recall enterName method to loop back to beginning, breaks all loops once an account is created
                    break;
                default:
                    System.out.println("Incorrect Response");
                    enterName(account);
                    break;
            }
        } else {
            System.out.println("Welcome " + account.name);
            account.balance = account.accounts.get(account.name);
        }
    }

}
