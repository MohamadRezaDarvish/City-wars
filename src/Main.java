import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseHelper.loadCardsFromDatabase();
        DatabaseHelper.loadUsersFromDatabase();
//leoo
        commandmanager.start();
        //add random cards after sign up;
    }
}
