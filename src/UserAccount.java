import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by alexanderhughes on 2/3/16.
 */
public class UserAccount {        //this class saves all user input
    static public Scanner scanner = new Scanner(System.in);
    static public HashMap<String, Double> accounts = new HashMap<>();
    public String name;
    public double balance;
    public String selection;
}


