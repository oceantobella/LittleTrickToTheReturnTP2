public class LevelHard extends Levels {

    private int maxItems;

    public LevelHard(Game game, int maxItems, MyFrame myFrame) {
        super(game, myFrame);
        this.createItems();
        this.createRooms();
        printWelcome();
        this.maxItems = maxItems;
    }

    public void createItems(){
        super.createItems();

        Item brazilnuts, acai, seringueira, buriti, pequizeiro, pitangueira, goiabeira, copaibeira, paubrasil,
        jaboticabeira, jacaranda, ananas, carnauba, facheiro, catingueira, angico, vitoriaregia, caranda, paratudo,
        jenipapo, canjerana, grapia, sucuuba, caroba;

        // create the items

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

        seringueira = new Item(

                "seringueira", // amazonia
                " you would see it in the river branks or flooded places of the " + "\n"
                + "dry land forest. The stem have a resin used to make rubber.",
                3
        );
        
        buriti = new Item(

                "buriti", // amazonia
                " contains large leaves that looks like stars and have " + "\n"
                + "flowers arranged in clusters. \n"
                + "The fruit is reddish-brown with shiny scales",
                3
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
                             
       goiabeira = new Item(

                "goiabeira", //cerrado
                " aromatic leaves, white flowers, tortuous, branched and very " + "\n"
                + "smooth trunk. Contains a green fruit with red or white pulp, " + "\n"
                + "usually sweet.",
                3
        );
                                     
        copaibeira = new Item(

                "copaibeira", //cerrado
                " a plant with healing and anti-inflammatory porperties. Large tree.",
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
         
        jacaranda = new Item(

                "jacaranda", //mata atlântica
                "  it is a delight to watch as white fuzzy blooms burst among "
                + "the tree's older bark, covering the tree with a white sea " + "\n"
                + "of petals.",
                3
        );
        
        ananas = new Item(

                "ananas", //mata atlântica
                " the tough leaves grow in large rosettes, arising basally from " + "\n"
                + "a crown.",
                3
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
        
        catingueira = new Item(

                "catingueira", //caatinga
                " it is considered an indicator of rainy periods "
                + "because its gems sprout with high umidity." + "\n"
                + " Have yellow beautiful flowers and sometimes the leaves " + "\n"
                + "adquires bad small.",
                2
        );
        
        angico = new Item(

                "angico", //caatinga
                "  is a tree famous for its white flowers that usually attract "+ "\n"
                        + "honey-producing bees.",
                4
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
           
        paratudo = new Item(

                "paratudo", //pantanal
                " medicinal plant with a beautiful flower that looks like a " + "\n"
                + "crown of thorns",
                1
        );
        
        jenipapo = new Item(

                "jenipapo", //pantanal
                " big tree with leaves arms that contains a brown fruit",
                4
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
        
        sucuuba = new Item(

                "sucuuba", //pampa
                " burly tree that produces rubber and has brown trunks and " + "\n"
                + "spiraled leaves.",
                4
        );
        
        caroba = new Item(

                "caroba", //pampa
                " is a tree that offers shade throughout the year and has " + "\n"
                + "fragrant flowers that attract birds.",
                4
        );
        
        
        itemArray.add(canjerana);  //pampa 12
        itemArray.add(grapia);//13
        itemArray.add(sucuuba);//14
        itemArray.add(caroba);//15

        itemArray.add(paubrasil);  // mata 16
        itemArray.add(jaboticabeira); //17
        itemArray.add(jacaranda); //18
        itemArray.add(ananas); //19

        itemArray.add(brazilnuts); //amazonia 20
        itemArray.add(acai);//21
        itemArray.add(seringueira); //22
        itemArray.add(buriti); //23

        itemArray.add(carnauba); //caatinga 24
        itemArray.add(facheiro); //25
        itemArray.add(catingueira); //26
        itemArray.add(angico); //27

        itemArray.add(pequizeiro); //cerrado 28
        itemArray.add(pitangueira); //29
        itemArray.add(goiabeira); //30
        itemArray.add(copaibeira); //31
        
        itemArray.add(vitoriaregia); //pantanal 32
        itemArray.add(caranda); //33
        itemArray.add(paratudo); //34
        itemArray.add(jenipapo); //35


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

        super.getRoomArray().get(0).setItemIntoTheRoom(itemArray.get(32));
        super.getRoomArray().get(1).setItemIntoTheRoom(itemArray.get(14));
        super.getRoomArray().get(2).setItemIntoTheRoom(itemArray.get(20));
        super.getRoomArray().get(3).setItemIntoTheRoom(itemArray.get(31));
        super.getRoomArray().get(4).setItemIntoTheRoom(itemArray.get(19));
        super.getRoomArray().get(5).setItemIntoTheRoom(itemArray.get(15));
        super.getRoomArray().get(0).setItemIntoTheRoom(itemArray.get(25));
        super.getRoomArray().get(1).setItemIntoTheRoom(itemArray.get(24));
        super.getRoomArray().get(2).setItemIntoTheRoom(itemArray.get(29));
        super.getRoomArray().get(3).setItemIntoTheRoom(itemArray.get(17));
        super.getRoomArray().get(4).setItemIntoTheRoom(itemArray.get(22));
        super.getRoomArray().get(5).setItemIntoTheRoom(itemArray.get(34));
        super.getRoomArray().get(0).setItemIntoTheRoom(itemArray.get(28));
        super.getRoomArray().get(1).setItemIntoTheRoom(itemArray.get(35));
        super.getRoomArray().get(2).setItemIntoTheRoom(itemArray.get(16));
        super.getRoomArray().get(3).setItemIntoTheRoom(itemArray.get(30));
        super.getRoomArray().get(4).setItemIntoTheRoom(itemArray.get(13));
        super.getRoomArray().get(5).setItemIntoTheRoom(itemArray.get(18));
        super.getRoomArray().get(0).setItemIntoTheRoom(itemArray.get(26));
        super.getRoomArray().get(1).setItemIntoTheRoom(itemArray.get(33));
        super.getRoomArray().get(2).setItemIntoTheRoom(itemArray.get(23));
        super.getRoomArray().get(3).setItemIntoTheRoom(itemArray.get(21));
        super.getRoomArray().get(4).setItemIntoTheRoom(itemArray.get(27));
        super.getRoomArray().get(5).setItemIntoTheRoom(itemArray.get(12));
        
        super.getRoomArray().get(0).setCorrectItem(itemArray.get(20));
        super.getRoomArray().get(0).setCorrectItem(itemArray.get(21));
        super.getRoomArray().get(0).setCorrectItem(itemArray.get(22));
        super.getRoomArray().get(0).setCorrectItem(itemArray.get(23));
        super.getRoomArray().get(1).setCorrectItem(itemArray.get(24));
        super.getRoomArray().get(1).setCorrectItem(itemArray.get(25));
        super.getRoomArray().get(1).setCorrectItem(itemArray.get(26));
        super.getRoomArray().get(1).setCorrectItem(itemArray.get(27));
        super.getRoomArray().get(2).setCorrectItem(itemArray.get(28));
        super.getRoomArray().get(2).setCorrectItem(itemArray.get(29));
        super.getRoomArray().get(2).setCorrectItem(itemArray.get(30));
        super.getRoomArray().get(2).setCorrectItem(itemArray.get(31));
        super.getRoomArray().get(3).setCorrectItem(itemArray.get(12));
        super.getRoomArray().get(3).setCorrectItem(itemArray.get(13));
        super.getRoomArray().get(3).setCorrectItem(itemArray.get(14));
        super.getRoomArray().get(3).setCorrectItem(itemArray.get(15));
        super.getRoomArray().get(4).setCorrectItem(itemArray.get(32));
        super.getRoomArray().get(4).setCorrectItem(itemArray.get(33));
        super.getRoomArray().get(4).setCorrectItem(itemArray.get(34));
        super.getRoomArray().get(4).setCorrectItem(itemArray.get(35));
        super.getRoomArray().get(5).setCorrectItem(itemArray.get(16));
        super.getRoomArray().get(5).setCorrectItem(itemArray.get(17));
        super.getRoomArray().get(5).setCorrectItem(itemArray.get(18));
        super.getRoomArray().get(5).setCorrectItem(itemArray.get(19));
        
        
        
        //              INDICE NA ARRAY ROOM                INDICE NA ARRAY ITEMS


    }

    protected void printWelcome() {
        super.printWelcome();
    }

}

