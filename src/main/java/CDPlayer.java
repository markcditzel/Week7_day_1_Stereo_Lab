public class CDPlayer {

    //    Properties
    private String make;
    private String model;
    private int numberOfCDDrawers;

    //    Constructor
    public CDPlayer(int numberOfCDDrawers){
        this.make = make;
        this.model = model;
        this.numberOfCDDrawers = numberOfCDDrawers;
    }

    //    Methods
    public String play(String cd){
        return "Playing " + cd;
    }

    public int getNumberOfCDDrawers(){
        return numberOfCDDrawers;
    }

}
