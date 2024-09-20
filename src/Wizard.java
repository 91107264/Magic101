public class Wizard extends Humanoid {
    String wand;

    int money;

    int mana;

    Staff staff;

    Wizard() {
        super();
        System.out.println("Created new Wizard.");
    }

    public Wizard(String name, int health, String wand, int money, int mana, Staff staff) {
        super(name, health);
        this.wand = wand;
        this.money = money;
        this.mana = mana;
        this.staff = staff;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public String getWand() {
        return wand;
    }

    public Staff getStaff(){ return staff;}

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

    public boolean canCast(int mana) {
        boolean cast;

        if(mana >= 50) {
            cast = true;
        }
        else {
            cast = false;
        }

        return cast;
    }

    public boolean canBuy(int money, int price) {
        if(money>= price) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String output= "wand: " + wand + "\nmoney: " + money + "\nmana: " + mana + "\n";
        return output;
    }
}
