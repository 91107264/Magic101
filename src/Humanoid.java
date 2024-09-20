public class Humanoid {
    public String name;
    public int health;

    public Humanoid() {

    }

    public Humanoid(String name, int health)  {
        this.name = name;
        this.health = health;
    }

    public void damageHumanoid(int damage) {
        this.health = this.health - damage;
    }

    public String getName() {
        return this.name;
    }
    public int getHealth() {
        return this.health;
    }

    public String toString() {
        String output= "name: " + name + "\nhealth: " + health;
        return output;
    }
}