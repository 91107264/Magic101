public class Bard {
    //1 instance variables
    String instrument;
    int money;
    int mana; //currently has

    //2 constructors
    public Bard(String instrument, int money, int mana) {
        this.instrument = instrument;
        this.money = money;
        this.mana = mana;
    }
    //3 getters and setters

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }



    //4 Brain methods

    //5 toString
     @Override
     public String toString() {
        String output= "instrument: " + instrument + "\nmoney: " + money + "\nmana: " + mana;
        return output;
    }
}

