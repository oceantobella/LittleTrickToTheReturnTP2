import java.util.ArrayList;

public abstract class Levels {

    protected Game game;
    protected String name;
    protected MyFrame myFrame;
    protected ArrayList<Item> itemArray;
    protected ArrayList<Room> roomArray;

    public Levels(Game game, MyFrame myFrame){

        this.game = game;
        itemArray = new ArrayList<Item>();
        roomArray = new ArrayList<Room>();
        this.myFrame = myFrame;
    }

    public ArrayList<Room> getRoomArray(){
        return roomArray;
    }

    public ArrayList<Item> getItemArray(){
        return itemArray;
    }

    protected void createRooms(int maxItems) {
        Room amazonia, caatinga, cerrado, pampa, pantanal, mataAtlantica;

        // create the rooms

        amazonia = new Room(

                "Amazônia",
                "large tropical rainforest, and the largest river basin in the " + "\n"
                + "world"

        );

        caatinga = new Room(

                "Caatinga",
                "white forest, generally stunted, somewhat sparse, and often " + "\n"
                + "thorny vegetation of the dry interior of northeastern Brazil"

        );

        cerrado = new Room(

                "Cerrado",
                "brazilian savanna, richest one in the world - vast dry and hot" + "\n"
                + " ecoregion, far from being lifeless"

        );

        pampa = new Room(

                "Pampa",
                "an extensive generally grass-covered plain of temperate South " + "\n"
                + "America east of the Andes" 

        );

        pantanal = new Room(

                "Pantanal",
                " where the land is covered by water, either salt, fresh, or " + "\n"
                + "somewhere in between, the largest tropical wetland and one " + "\n"
                + "of the most pristine in the world"

        );

        mataAtlantica = new Room(

                "Mata Atlantica",
                "tropical forest that is a major center of endemism and its " + "\n"
                + "plant formations are extremely heterogeneous, ranging from " + "\n"
                + "open fields in mountainous regions to rainy erennial forests " + "\n"
                + "in the coastal lowlands."

        );


        // initialise room exits

        amazonia.setExit("east", caatinga);
        amazonia.setExit("south", pantanal);
        amazonia.setExit("west", cerrado);

        caatinga.setExit("west", mataAtlantica);
        caatinga.setExit("east", cerrado);

        cerrado.setExit("east", amazonia);
        cerrado.setExit("south", mataAtlantica);

        pampa.setExit("north", mataAtlantica);

        pantanal.setExit("west", cerrado);
        pantanal.setExit("north", amazonia);

        mataAtlantica.setExit("south", pampa);
        mataAtlantica.setExit("north", caatinga);
        mataAtlantica.setExit("east", cerrado);

        game.setCurrentRoom(amazonia);  // start game outside

        //add rooms to ArrayList

        roomArray.add(amazonia);
        roomArray.add(caatinga);
        roomArray.add(cerrado);
        roomArray.add(pampa);
        roomArray.add(pantanal);
        roomArray.add(mataAtlantica);

        for(Room room : roomArray)
        {
            room.setMaxItems(maxItems);
        }

        amazonia.setItemIntoTheRoom(itemArray.get(0));
        amazonia.setItemIntoTheRoom(itemArray.get(6));

        amazonia.setCorrectItem(itemArray.get(4)); //
        amazonia.setCorrectItem(itemArray.get(5));

        caatinga.setItemIntoTheRoom(itemArray.get(1));
        caatinga.setItemIntoTheRoom(itemArray.get(10));

        caatinga.setCorrectItem(itemArray.get(8)); //
        caatinga.setCorrectItem(itemArray.get(9));

        cerrado.setItemIntoTheRoom(itemArray.get(2));
        cerrado.setItemIntoTheRoom(itemArray.get(9));

        cerrado.setCorrectItem(itemArray.get(10)); //
        cerrado.setCorrectItem(itemArray.get(11));

        pampa.setItemIntoTheRoom(itemArray.get(3));
        pampa.setItemIntoTheRoom(itemArray.get(8));

        pampa.setCorrectItem(itemArray.get(0)); //
        pampa.setCorrectItem(itemArray.get(1));

        pantanal.setItemIntoTheRoom(itemArray.get(4));
        pantanal.setItemIntoTheRoom(itemArray.get(7));

        pantanal.setCorrectItem(itemArray.get(6)); //
        pantanal.setCorrectItem(itemArray.get(7));

        mataAtlantica.setItemIntoTheRoom(itemArray.get(5));
        mataAtlantica.setItemIntoTheRoom(itemArray.get(11));

        mataAtlantica.setCorrectItem(itemArray.get(2)); //
        mataAtlantica.setCorrectItem(itemArray.get(3));
    }

    protected void printWelcome() {
        myFrame.getTerminalTextArea().append("\n\nWelcome to the last chance to find a Little Trick to the Return!");
        myFrame.getTerminalTextArea().append("\nYou are walking around brazilian biomes and you may discover");
       myFrame.getTerminalTextArea().append("\nif all plants are in the right places.");
   
        myFrame.getTerminalTextArea().append(game.getCurrentRoom().getBiomaLongDescription() + game.getCurrentRoom().getItemString()
        + game.getCurrentRoom().getExitString());
    }

    protected void createItems(){

        Item araucaria, monstera, grass, maranta, andiroba, guarana, orchids, mandacaru,ambui, bromelia, ipe, quaresmeira ;

        // create the items

        araucaria = new Item(

                "araucaria", 
                " this sweetie is really tall and his leaves are like needles, " + "\n"
                + "they stand on the top of the branches",
                4

        );

        grass = new Item(

                "grass",
                " this little one covers all around the ground with tiny leaves " + "\n"
                + "like a rug",
                2
        );

        monstera = new Item(

                "monstera",
                "maybe you could look for a new one here to put somewhere else",
                3
        );



        maranta = new Item(

                "maranta",
                "they close their leaves when the air is too dry",
                1
        );

        andiroba = new Item(

                "andiroba",
                "large tree, with a fruit that is a capsule that opens when it " + "\n"
                + "falls to the ground",
                1
        );

        guarana = new Item(

                "guarana",
                " has contrasting colors of the partially open fruit, which " + "\n"
                + "creates the appearance of eyeballs",
                2
        );

        orchids = new Item(

                "orchids",
                " blooming in every color except blue and black, orchids are " + "\n"
                + "known for their showy and sweet-smelling flowers.",
                3
        );

        mandacaru = new Item(

                "mandacaru",
                "careful with the thorns",
                4
        );

        bromelia = new Item(

                "bromelia",
                " are strong and very easy to maintain. They will bring you great " + "\n"
                + "pleasure for an average of 3 – 6 months.",
                3
        );

        quaresmeira = new Item(

                "quaresmeira",
                " this tree has beautiful purple flowers. ",
                1
        );

        ambui = new Item(

                "ambui",
                " nice to take them when they are all yellow just like the idea" + "\n"
                + " we have of sun",
                2
        );

        ipe = new Item(

                "ipe",
                " the name Ipê, of Tupi origin, means thick bark tree. Found in " + "\n"
                + "all regions of Brazil in a bright yellow color or a shinning" + "\n"
                + " purple flower.",
                4
        );
        /**
         *
         * add items to ArrayList
         *
         */

        itemArray.add(araucaria);  //pampa
        itemArray.add(grass);

        itemArray.add(monstera);  // mata
        itemArray.add(maranta);

        itemArray.add(andiroba); //amazonia
        itemArray.add(guarana);

        itemArray.add(orchids); //pantanal
        itemArray.add(ambui);

        itemArray.add(mandacaru); //caatinga
        itemArray.add(bromelia);

        itemArray.add(quaresmeira); //cerrado
        itemArray.add(ipe);

    }
}

