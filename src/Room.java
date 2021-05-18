import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Room
{
    private String name;
    private String description;
    private ArrayList<Item> correctItem;
    private HashMap<String, Room> exits;// stores exits of this room.
    private ArrayList<Item> item;
    private int maxItems;
    private boolean checkDanger;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String name, String description)
    {
        this.name = name;
        this.description = description;
        exits = new HashMap<>();
        item = new ArrayList<>();
        correctItem = new ArrayList<>();
        checkDanger = false;
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return "\n" + description;
    }

    public String getName (){

        return "\n" + name;

    }

    /**
     * Return a description of the room in the form:
     *     You are in Amazônia.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getBiomaLongDescription() {
        return "\nYou are in " + name + ",\n" + "a " + description;              
    }


    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    public String getExitString()
    {
        String returnString = "\nExits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }

    public void setItemIntoTheRoom(Item item) {

        this.item.add(item);

    }

    // print the names of items in the room

    public String getItemString() {

        String returnString = "\n";
        for (Item itemString : item) {
            returnString += itemString.getName() + " weitgh: " + itemString.getWeight() + "\n";
        }
        return returnString;
    }
    public String getItemDescription() {

        String returnString =  "\n" + "You see: ";
        for(Item itemDescription : item) {
            returnString += "\n" + itemDescription.getName()+ "  " + itemDescription.getDescription() + " \n ";
        }
        return returnString;
    }

    // remove items out of the room

    public void removeItemOutOfTheRoom(Item item){

        this.item.remove(item);

    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public ArrayList <Item> getArrayItem (){

        return this.item;

    }
    public void addItemInTheRoom(Item item){
        this.item.add(item);
    }
    public void setCorrectItem(Item item) {
        this.correctItem.add(item);
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public boolean checkItems() {
        int numberOfItems = correctItem.size();

        for(Item i : item){
            for(Item c : correctItem){
                if(i.getName().equals(c.getName()))
                {
                    numberOfItems -= 1;
                }
            }
        }

        if(numberOfItems == 0){
            return true;
        }else{
            return false;
        }
    }


    public boolean isCheckDanger() {
        return checkDanger;
    }

    public void setCheckDanger(boolean checkDanger) {
        this.checkDanger = checkDanger;
    }
}
