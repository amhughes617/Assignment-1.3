/**
 * Created by alexanderhughes on 2/5/16.
 */
public class EnterName {
    public void enterName(UserAccount account) throws Exception {
        account.name = null;
        System.out.println("Please enter your name.");
        account.name = UserAccount.scanner.nextLine();
        if (account.name.isEmpty()) {
            throw new Exception("User must enter a name.");
        } else if (!UserAccount.accounts.containsKey(account.name)) {
            System.out.println("Would you like to create a new account? [y/n]");
            String makeAccount = UserAccount.scanner.nextLine();
            switch (makeAccount) {
                case "y":
                    UserAccount.accounts.put(account.name, account.balance);
                    System.out.println("Welcome " + account.name);
                    break;
                case "n":
                    System.out.println("Have a nice day!");
                    enterName(account);
                    break;
                default:
                    System.out.println("Incorrect Response");
                    enterName(account);
                    break;
            }
        } else {
            System.out.println("Welcome " + account.name);
            account.balance = UserAccount.accounts.get(account.name);
        }
    }

}
