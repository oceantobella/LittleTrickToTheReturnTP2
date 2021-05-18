public class LevelMedium extends Levels{

    private int maxItems;

    public LevelMedium(Game game, int maxItems, MyFrame myFrame) {

        super(game, myFrame);
        this.createItems();
        this.createRooms();
        printWelcome();
        this.maxItems = maxItems;
    }

    public void createItems(){
        super.createItems();

        Item brazilnuts, acai, pequizeiro, pitangueira, paubrasil,
        jaboticabeira, carnauba, facheiro, vitoriaregia, caranda,
        canjerana, grapia;
        
        brazilnuts = new Item(

                "brazilnuts", // amazonia
                " a large and long-lived tree with nutshells. It leaves nearly" + "\n"
                + "500 years and the fruit is called," + "\n"
                + "in portuguese, of " + "castanha-do-pará.",
                4

        );

        acai = new Item(

                "acai", // amazonia
                " a palm tree with açaí bunches, a purple fruit that contains " + "\n"
                + "antioxidant and energetic properties -"+ "\n"
                + "used to make an iced cream and wine.",
                2
        );
        
         pequizeiro = new Item(

                "pequizeiro", //cerrado
                " a tree with twisted branches that contains a fruit with a " + "\n"
                + "yellow pulp used \n"
                + "a lot in brazilian culinary.",
                4
        );
                     
        pitangueira = new Item(

                "pitangueira", //cerrado
                " simple, small and shiny leaves, thin and twisted branches - " + "\n"
                + "lonely white flowers that becomes a red fruit with fleshy pulp.",
                2
        );
        
        paubrasil = new Item(

                "paubrasil", //mata atlântica
                " is characterised by a flaked bark that reveals a blood-red " + "\n"
                + "wood underneath, fragrant yellow flowers and small, leathery " + "\n"
                + "leaves.",
                4
        );
        
        jaboticabeira = new Item(

                "jaboticabeira", //mata atlântica
                " it is a delight to watch as white fuzzy blooms burst among the "
                + "tree's older bark, covering the tree with a white sea of " + "\n"
                + "petals.",
                4
        );
         
         carnauba = new Item(

                "carnauba", //caatinga
                " endemic palm tree that contains a wax to impermeabialize its " + "\n"
                + "straws to hold water when the weather is dry.",
                4
        );
         
        facheiro = new Item(

                "facheiro", //caatinga
                " a large cactus with trunk and ramifications that looks " + "\n"
                + "like prickly long arms.",
                2
        );
        
         vitoriaregia = new Item(

                "vitoriargia", //pantanal
                " it keeps itself floating over the water, when you look you " + "\n"
                + "see a large circle that can contain or not a beautiful flower, " + "\n"
                + "symbol of harmony. It is part of lots of brazilian legends",
                2
        );
          
        caranda = new Item(

                "caranda", //pantanal
                " palm tree with big stairy leaves, that also looks like a hand " + "\n"
                + "with lots of long fingers, above a thin and lengthy trunk",
                3
        );
        
        canjerana = new Item(

                "canjerana", //pampa
                "  its wood is red, pink or yellow. Its fruits are very appreciated by birds \n "
                + "and small mammals.",
                2
        );
        
        grapia = new Item(

                "grapia", //pampa
                " is considered standard for dry and deep terrain, always found" + "\n"
                + " in high places.",
                3
        );
        
        itemArray.add(canjerana);  //pampa 12
        itemArray.add(grapia);//13
        
        itemArray.add(paubrasil);  // mata 14
        itemArray.add(jaboticabeira); //15
        
        itemArray.add(brazilnuts); //amazonia 16
        itemArray.add(acai);//17
        
        itemArray.add(carnauba); //caatinga 18
        itemArray.add(facheiro); //19
        
        itemArray.add(pequizeiro); //cerrado 20
        itemArray.add(pitangueira); //21
        
        itemArray.add(vitoriaregia); //pantanal 22
        itemArray.add(caranda); //23
     

    }

    public void createRooms(){
        super.createRooms(maxItems); //chamada ao metodo da super classe, comum a todos, que cria as salas e adiciona os itens padroes

        /*
        roomArray.add(amazonia); index 0
        roomArray.add(caatinga); index 1
        roomArray.add(cerrado); index 2
        roomArray.add(pampa); index 3
        roomArray.add(pantanal); index 4
        roomArray.add(mataAtlantica); index 5
         */

        super.getRoomArray().get(3).setCorrectItem(itemArray.get(12));
        super.getRoomArray().get(3).setCorrectItem(itemArray.get(13));
        super.getRoomArray().get(5).setCorrectItem(itemArray.get(14));
        super.getRoomArray().get(5).setCorrectItem(itemArray.get(15));
        super.getRoomArray().get(0).setCorrectItem(itemArray.get(16));
        super.getRoomArray().get(0).setCorrectItem(itemArray.get(17));
        super.getRoomArray().get(1).setCorrectItem(itemArray.get(18));
        super.getRoomArray().get(1).setCorrectItem(itemArray.get(19));
        super.getRoomArray().get(2).setCorrectItem(itemArray.get(20));
        super.getRoomArray().get(2).setCorrectItem(itemArray.get(21));
        super.getRoomArray().get(4).setCorrectItem(itemArray.get(22));
        super.getRoomArray().get(4).setCorrectItem(itemArray.get(23));
        
        super.getRoomArray().get(0).setItemIntoTheRoom(itemArray.get(22));
        super.getRoomArray().get(1).setItemIntoTheRoom(itemArray.get(13));
        super.getRoomArray().get(2).setItemIntoTheRoom(itemArray.get(14));
        super.getRoomArray().get(3).setItemIntoTheRoom(itemArray.get(15));
        super.getRoomArray().get(4).setItemIntoTheRoom(itemArray.get(16));
        super.getRoomArray().get(5).setItemIntoTheRoom(itemArray.get(17));
        super.getRoomArray().get(0).setItemIntoTheRoom(itemArray.get(18));
        super.getRoomArray().get(1).setItemIntoTheRoom(itemArray.get(19));
        super.getRoomArray().get(2).setItemIntoTheRoom(itemArray.get(20));
        super.getRoomArray().get(3).setItemIntoTheRoom(itemArray.get(21));
        super.getRoomArray().get(4).setItemIntoTheRoom(itemArray.get(12));
        super.getRoomArray().get(5).setItemIntoTheRoom(itemArray.get(23));
    }

    protected void printWelcome() {
        super.printWelcome();
    }
}