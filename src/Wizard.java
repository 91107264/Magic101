public class Wizard {
    String wand;

    int money;

    int mana;

    public Wizard(String wand, int money, int mana) {
        this.wand = wand;
        this.money = money;
        this.mana = mana;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public String getWand() {
        return wand;
    }

    public void setMana() { this.mana = mana; }

    public int getMana() {
        return mana;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        String output= "wand: " + wand + "\nmoney: " + money + "\nmana: " + mana;
        return output;
    }
}
