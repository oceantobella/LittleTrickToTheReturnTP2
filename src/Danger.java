public class Danger {
	
    private boolean fire;
    private boolean deforestation;
    private boolean hunter;
    private MyFrame myFrame;
    
    
    public Danger(MyFrame myFrame) {
        this.myFrame = myFrame;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public boolean isDeforestation() {
        return deforestation;
    }

    public void setDeforestation(boolean deforestation) {
        this.deforestation = deforestation;
    }

    public boolean isHunter() {
        return hunter;
    }

    public void setHunter(boolean hunter) {
        this.hunter = hunter;
    }
    
    public void arrestHunter(Player player) {
        hunter = true;
        
        myFrame.getjDialog2().setVisible(true);
        myFrame.getOptionTextArea().append("\n\nYou've found a hunter looking for animals");
        
        player.setOxygen(-30);
        myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());
        
        myFrame.getOptionTextArea().append("\nYou now have three options: ");
        myFrame.getOptionTextArea().append("\n1 - arrest the hunter");
        myFrame.getOptionTextArea().append("\n2 - kill the hunter");
        myFrame.getOptionTextArea().append("\n3 - keep going");
    }

    public void controlFire(Player player) {
        fire = true;
        
        myFrame.getjDialog2().setVisible(true);
        myFrame.getOptionTextArea().append("\nYou've found fire splitting around");
        
        player.setOxygen(-30);
        myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());

        myFrame.getOptionTextArea().append("\n\nYou now have three options: ");
        myFrame.getOptionTextArea().append("\n1 - ignore it");
        myFrame.getOptionTextArea().append("\n2 - use your infinite level of water to control fire");
        myFrame.getOptionTextArea().append("\n3 - go find the firefighters");
    }

    public void holdDeforestation (Player player) {
        deforestation = true;
        
        myFrame.getjDialog2().setVisible(true);
        myFrame.getOptionTextArea().append("\n\nYou've found deforestation all around");
        
        player.setOxygen(-30);
        myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());

        myFrame.getOptionTextArea().append("\nYou now have three options: ");
        myFrame.getOptionTextArea().append("\n1 - plant a tree");
        myFrame.getOptionTextArea().append("\n2 - go away and let life take care of the problem");
        myFrame.getOptionTextArea().append("\n3 - banish the farmers");
    }

    public void switchDeforestation(Player player, int choice){
        switch (choice) {
            case 1:
                player.setOxygen(+40);
                break;
            case 2:
                player.setOxygen(-30);
                break;
            case 3:
                player.setOxygen(-player.getOxygen().getPercent()*50/100);
                break;
        }
        myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());
    }

    public void switchcontrolFire(Player player, int choice){
        switch (choice) {
            case 1:
                player.setOxygen(-30);
                break;
            case 2:
                player.setOxygen(+50);
                break;
            case 3:
                player.setOxygen(-10);
                break;
        }
        myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());
    }

    public void switcharrestHunter(Player player, int choice){
        switch (choice) {
            case 1:
                player.setOxygen(+40);
                break;

            case 2:
                player.setOxygen(-player.getOxygen().getPercent()*50/100);
                break;

            case 3:
                player.setOxygen(-30);
                break;
        }
        myFrame.getOxygenBarPercent().setText("Oxygen: "+player.getOxygen().getPercent());
    }
}
