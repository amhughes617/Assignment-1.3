import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by alexanderhughes on 2/3/16.
 */
public class UserAccount {        //this class saves all user input
    public static  Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Double> accounts = new HashMap<>();
    public String name;
    public double balance;
    public String selection;
}