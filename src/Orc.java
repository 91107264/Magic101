public class Orc {
    String club;

    int money;

    int strength;

    public Orc(String club, int money, int strength)  {
        this.club = club;
        this.money = money;
        this.strength = strength;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public boolean canAttack(int strength1) {
        boolean attack;

        if(strength1 >= 10) {
            attack = true;
        }
        else {
            attack = false;
        }

        return attack;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "club='" + club + '\'' +
                ", money=" + money +
                ", strength=" + strength +
                '}';
    }
}
