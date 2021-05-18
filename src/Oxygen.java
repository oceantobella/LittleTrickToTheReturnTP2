public class Oxygen {

    private double percent;
    private Game game;

    public Oxygen(Game game){
        this.game = game;
        this.percent = 100;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent){
        if(this.percent + percent > 100){
            this.percent = 100;
        }else if(this.percent + percent < 0){
            this.percent = 0;
        }
        else{
            this.percent += percent;
        }
        game.youAreDead();
    }
}
