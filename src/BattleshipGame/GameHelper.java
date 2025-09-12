package BattleshipGame;

import java.util.Scanner;

public class GameHelper {
    Scanner sc = new Scanner(System.in);

    public String getUserInput() {
        String userInput;
        userInput = sc.nextLine();
        return userInput;

    }
}
