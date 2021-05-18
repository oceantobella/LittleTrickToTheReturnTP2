import java.util.ArrayList;

public class Player {

    private int maxWeight;
    private boolean isAlive;
    private Room currentRoom;
    private Oxygen oxygen;
    private ArrayList <Item> bag;
    
    private MyFrame myFrame;

    public Player(Room currentRoom, int maxWeight, MyFrame myFrame, Game game){
        bag = new ArrayList<>();
        this.oxygen = new Oxygen(game);
        this.currentRoom = currentRoom;
        this.maxWeight = maxWeight;
        this.isAlive = true;
        this.myFrame = myFrame;
    }

    public void setCurrentRoom(Room currentRoom) {

        this.currentRoom = currentRoom;

    }

    public Room getCurrentRoom() {

        return currentRoom;
    }

    public ArrayList<Item> getBag() {
        return bag;
    }

    public boolean setBag(Item item) {
        int weightItemsBag = 0;
        for(Item alreadyInTheBag : bag)  {
            weightItemsBag += alreadyInTheBag.getWeight();

        }
        if((weightItemsBag + item.getWeight())> maxWeight){
            myFrame.getTerminalTextArea().append("Oops! The bag is too heavy. ");
            myFrame.getTerminalTextArea().append("maybe you should left something in this room and get something lighter ");
            return false;
        } else {
            bag.add(item);
            return true;
        }

    }

    public void removeItemBag(Item item) {
        this.bag.remove(item);
    }


    public String getBagString()
    {
        String returnString = "Items in the bag:";
        for(Item whatDoYouSee : bag) {
            returnString += " " + whatDoYouSee.getName();
        }
        return returnString;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setBag(ArrayList<Item> bag) {
        this.bag = bag;
    }

    public Oxygen getOxygen() {
        return oxygen;
    }

    public void setOxygen(double value) {
        this.oxygen.setPercent(value);
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }

    public void aliveOrNot(){
        if(oxygen.getPercent() <= 0){
            isAlive = false;
        }
    }

}
