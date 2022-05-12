public class CommandLineInterface implements GameViewInterface {
    public CommandLineInterface(){

    }
    public void displayBoard(BaseBoard board) {
        System.out.println(board);
    }
    public void refreshBoard(Board board) {
    displayBoard(board);}

    public void displayHelp() {
        System.out.println("Type \"m\" to move a unit.");
    }

}
