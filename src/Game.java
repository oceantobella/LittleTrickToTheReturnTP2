import java.util.ArrayList;

public class Game {

    private Parser parser;
    private Room currentRoom;
    private Player player;
    private Levels level;
    private Danger danger;
    private int auxCountRightRooms = 0;
    
    private MusicPlayer mP;
    private TrackReader trackReader;
    private ArrayList<Track> arrayTrack;
    
    private MyFrame myFrame;
    private int countRightRooms;


    /**
     * Create the game and initialise its internal map.
     */
    public Game() {
        this.myFrame = new MyFrame(this);
        
        parser = new Parser();
        player = new Player(currentRoom, 5, myFrame, this);
        danger = new Danger(myFrame);
        
        trackReader = new TrackReader();
        arrayTrack = new ArrayList<Track>();
        arrayTrack = trackReader.readTracks("./src/Audio", ".mp3");
        mP = new MusicPlayer(myFrame);
       
        myFrame.getTerminalTextArea().append("Please, select the difficult level you wanna play:");
        mP.startPlaying(arrayTrack.get(5).getFilename());
            
    }
    
            
    /*public void play () ACHO QUE NAO PRECISA DESSE CARA
    {
        player.getCurrentRoom();
    }*/

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    
    public void callProcessCommand(Command command){
        processCommand(command);
    }
    
    private void processCommand (Command command)
    {
       
        if(level instanceof LevelMedium || level instanceof LevelHard){
            myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());
        }

        String commandWord = command.getCommandWord();
        
       if (commandWord.equals("take")) {

            String itemName = command.getSecondWord();

            Item item = null;

            for (Item item1 : currentRoom.getArrayItem()) {

                if (item1.getName().equals(itemName)) {
                    item = item1;
                }
            }
            if (command.getSecondWord() == null) {

                myFrame.getTerminalTextArea().append("\n\nInvalid command, please insert the item name");

            } else {

                if (item != null) {

                    if(player.setBag(item)) {
                        myFrame.getTerminalTextArea().append("\n" + itemName + " added to the bag");
                        currentRoom.removeItemOutOfTheRoom(item);
                    }
                } else {
                    myFrame.getTerminalTextArea().append("\nItem not found");
                }
            }

        } else if (commandWord.equals("put")) {
            String itemName = command.getSecondWord();

            Item item = null;

            for (Item item1 : player.getBag()) {

                if (item1.getName().equals(itemName)) {
                    item = item1;
                }
            }
            if (command.getSecondWord() == null) {

                myFrame.getTerminalTextArea().append("\n\nInvalid command, please insert the item name");

            } else {

                if (item != null) {

                    if(level instanceof LevelEasy){
                        currentRoom.addItemInTheRoom(item);
                        player.removeItemBag(item);
                        myFrame.getTerminalTextArea().append("\n"+itemName + " added to the room");
                    }else if(currentRoom.getMaxItems() < currentRoom.getItem().size()){
                        currentRoom.addItemInTheRoom(item);
                        player.removeItemBag(item);
                        myFrame.getTerminalTextArea().append("\n"+itemName + " added to the room");
                    }
                    else{
                        myFrame.getTerminalTextArea().append("\nMaximum number of items");
                    }

                } else {
                    myFrame.getTerminalTextArea().append("\nItem not found");
                }
            }
 
            if(endGame()){
                mP.startPlaying(arrayTrack.get(6).getFilename());
                myFrame.getTerminalTextArea().append("\n\nYOU WON!!! All items blablabla....." + "\n"
                        + " the rest you already know. Congrats!");
            }
        }
       
        putDanger();
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    
    public void HelpItemsOnBackpack(){
        myFrame.getTerminalTextArea().append(player.getBagString());
     }
     
      public void HelpItemsInTheRoom(){
         myFrame.getTerminalTextArea().append(currentRoom.getItemString());
     }
      
       public void HelpItemsDescription(){
         myFrame.getTerminalTextArea().append(currentRoom.getItemDescription());
     }
       
        public void HelpBiomaDescription(){
         myFrame.getTerminalTextArea().append(currentRoom.getBiomaLongDescription());
     }
       
        public void HelpDirections(){
         myFrame.getTerminalTextArea().append(currentRoom.getExitString());
     }
    
    public void callGoRoom(Command command){
        goRoom(command);
    }
    
    /**
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom (Command command)
    {

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            myFrame.getTerminalTextArea().append("\nThere is no door!");
        } else {
            currentRoom = nextRoom;
            myFrame.getTerminalTextArea().append(currentRoom.getBiomaLongDescription() + currentRoom.getItemString() + currentRoom.getExitString());
        }
    }

    public Room getCurrentRoom()
    {
        return currentRoom;
    }

    public void setCurrentRoom(Room room)
    {
        currentRoom = room;
    }
    
    public Player getPlayer(){
        return player;
    }

    public Danger getDanger(){
       return danger;
   }

    public MusicPlayer getmP() {
        return mP;
    }

    public ArrayList<Track> getArrayTrack() {
        return arrayTrack;
    }

    public void menu(int menuSelection){
        switch (menuSelection) {

            case 1:
                level = new LevelEasy(this, 73, myFrame);
                break;
            case 2:
                level = new LevelMedium(this, 10, myFrame);
                break;
            case 3:
                level = new LevelHard(this,8, myFrame);
                break;
        }
    }
    
public void putDanger(){
        
        countRightRooms = 0;
        for(Room room : level.getRoomArray()) {
            if(room.checkItems()){
                countRightRooms++;
            }
        }
        
        if(countRightRooms > 0 && countRightRooms % 2 == 0){
            
            if (countRightRooms != auxCountRightRooms){
                
            auxCountRightRooms = countRightRooms;
            mP.stop();            
            
            if((currentRoom.equals(level.getRoomArray().get(2)) && !currentRoom.isCheckDanger()) || (currentRoom.equals(level.getRoomArray().get(1)) && !currentRoom.isCheckDanger())){
                mP.startPlaying(arrayTrack.get(0).getFilename());
                danger.controlFire(player);
                currentRoom.setCheckDanger(true);
            }else if((currentRoom.equals(level.getRoomArray().get(3)) && !currentRoom.isCheckDanger()) || (currentRoom.equals(level.getRoomArray().get(4)) && !currentRoom.isCheckDanger())){
                mP.startPlaying(arrayTrack.get(4).getFilename());
                danger.arrestHunter(player);
                currentRoom.setCheckDanger(true);
            }else if((currentRoom.equals(level.getRoomArray().get(0)) && !currentRoom.isCheckDanger()) || (currentRoom.equals(level.getRoomArray().get(5)) && !currentRoom.isCheckDanger())){
                mP.startPlaying(arrayTrack.get(3).getFilename());
                danger.holdDeforestation(player);
                currentRoom.setCheckDanger(true);
                }
            }
        }
        myFrame.getOxygenBarPercent().setText("Oxygen: " + player.getOxygen().getPercent());
        //myFrame.getTerminalTextArea().append(currentRoom.getLongDescription());
    }

    public void youAreDead(){
        player.aliveOrNot();
        if(!player.isAlive()){
            myFrame.getTerminalTextArea().append("\n\nSorry, you're dead");
            myFrame.getNorthButton().setEnabled(false);
            myFrame.getSouthButton().setEnabled(false);
            myFrame.getEastButton().setEnabled(false);
            myFrame.getWestButton().setEnabled(false);
            myFrame.getPutButton().setEnabled(false);
            myFrame.getHelpMenuBar().setEnabled(false);
            myFrame.getTakeButton().setEnabled(false);
            mP.stop();
        }
    }
    
    private boolean endGame(){

        boolean check = true;

        for(Room allItemsCorrect : level.getRoomArray()) {
            if(allItemsCorrect.checkItems() == false){
                check = false;
        }
        }

        return check;
    
    }
}