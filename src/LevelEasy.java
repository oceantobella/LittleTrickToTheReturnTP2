public class LevelEasy extends Levels{


    public LevelEasy(Game game, int maxItems, MyFrame myFrame) {
        super(game, myFrame);
        super.createItems();
        super.createRooms(maxItems);
        this.printWelcome();
    }

    protected void printWelcome() {
        super.printWelcome();
    }

    protected void createItems() {
        super.createItems();
    }
}
