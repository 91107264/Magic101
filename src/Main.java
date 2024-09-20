import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String currentFocus = "";
        ArrayList<Object> Characters = new ArrayList<Object>();

        Bard saltine = new Bard("Sckart", 100, "flute", 10, 100);
        Bard skilledBard = new Bard("Jake", 100,"trombone", 200, 1000000000);

        Characters.add(saltine);
        Characters.add(skilledBard);

        Staff JohnStaff = new Staff("2000", 100, 30, 100);
        Staff JimStaff = new Staff("3000", 200, 100, 200);

        Wizard jonjon = new Wizard();
        jonjon = new Wizard("John", 100,"excal", 10, 100, JohnStaff);
        Wizard jimothy = new Wizard("Jim", 100,"wood", 20, 100, JimStaff);

        Characters.add(jonjon);
        Characters.add(jimothy);

        Orc JAWN1 = new Orc("Jonny Jackson",100,"long", 10, 100);
        Orc JAWN2 = new Orc("Jonny Jameson",100,"flat", 15, 150);

        Characters.add(JAWN1);
        Characters.add(JAWN2);

        System.out.println("Characters: " + Characters.toString());

        System.out.println("Lets see skilled Bard go crazy.");
        currentFocus = skilledBard.getName();

        if(currentFocus.equals("Jake")) {
            saltine.damageHumanoid(30);
        }

        System.out.println("New health: " + saltine.getHealth());
        Staff.bigBrain(jonjon.getStaff());

        System.out.println(jimothy.toString());
        System.out.println("Jimothy can cast: " + jimothy.canCast(jimothy.mana));
        System.out.println("JonJon can cast: " + jonjon.canCast(jonjon.mana));

        System.out.println("Jonny Jackson can attack: " + JAWN1.canAttack(JAWN1.strength));
        System.out.println("Jonny Jackson can buy a candy bar: " + JAWN1.canBuy(JAWN1.money, 40));
        System.out.println("Jonny Jackson can buy a candy bar: " + JAWN1.canBuy(jonjon.money, 40));
        System.out.println("Jonny Jackson can buy a candy bar: " + JAWN1.canBuy(saltine.money, 40));
    }
}