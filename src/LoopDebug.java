import java.util.Scanner;

public class LoopDebug {



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        do {
            userInput = keyboard.next();
            System.out.println(userInput);

        }
        while (userInput != "Yes");
    }
}




