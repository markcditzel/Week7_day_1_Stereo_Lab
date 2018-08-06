public abstract class Component {

//    properties
    private String make;
    private int model;

//    constructor
    public Component(){
        this.make = make;
        this.model = model;
    }

//    methods
    public String setMake(String make){
        return this.make;
    }

    public int setModel(int model){
        return this.model;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public String play(String music, int volume){
        return "Playing " + music + " at " + volume + " decibels!";
    }

}
