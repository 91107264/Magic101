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

    public void setMana (int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    //4 Brain methods

    public boolean canPlay(int mana, Bard user) {

        if(mana >= 50) {
            user.setInstrument("yes");
            return true;
        }
        else {
            return false;
        }
    }

    //5 toString
     @Override
     public String toString() {
        String output= "instrument: " + instrument + "\nmoney: " + money + "\nmana: " + mana;
        return output;
    }
}