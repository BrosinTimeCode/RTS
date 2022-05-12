import java.util.Scanner;

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
    public void handleUserInput() {
        viewInterface.displayHelp();
        Scanner userInput = new Scanner(System.in);
        while(userInput.hasNext()) {
            String command = userInput.next();
            switch(command) {
                case "m":
                    //TODO: Finish movement
                    System.out.println("Type in row and column of unit you want to move");
                    int row = userInput.nextInt();
                    int column = userInput.nextInt();
                    System.out.println("Type in row and column of unit you want to move");
            }
        }

    }
}
