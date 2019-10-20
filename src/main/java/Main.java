import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Viev.loadGame();
            Scanner scanner = new Scanner(System.in);
            String type = scanner.nextLine();
            StartGame.start(type);
        }
}}
