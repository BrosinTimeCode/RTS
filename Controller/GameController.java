package Controller;
import View.GameViewInterface;
import View.CommandLineInterface;
import Model.BaseBoard;
import Model.TestBoard;
import Model.Board;
import java.util.Scanner;
import java.util.Timer;

public class GameController {
    GameViewInterface viewInterface;
    BaseBoard board;

    public GameController(int viewType, int boardType) {
        switch(boardType) {
            case 1:
                board = new TestBoard();
                break;
            default:
                board = new Board();
        }
        switch(viewType) {
            default:
                viewInterface = new CommandLineInterface();
        }
    }
    public void initialize() {
        Timer timer = new Timer();
        long oneSecond = 1000;
        RefreshMapTask task = new RefreshMapTask(viewInterface, board);
        timer.schedule(task, 0, oneSecond);
    }
    public void handleUserInput() {
        viewInterface.displayHelp();
        Scanner userInput = new Scanner(System.in);
        while(userInput.hasNext()) {
            String[] command = Console.parse(userInput.next());
            switch(command[0]) {
                case "m":
                    //move a unit
                case "s":
                    //select a unit
                case "a":
                    //attack a unit
                case "h":
                    //display list of commands
                default:
                    //invalid command
            }
        }
    }
}
