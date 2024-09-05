public class Main {
    public static void main(String[] args) {

        Bard saltine = new Bard("flute", 10, 100);
        Bard skilledBard = new Bard("trombone", 200, 1000000000);

        Wizard jonjon = new Wizard("excal", 10, 100);

        Orc JAWN = new Orc("long", 10, 100);

        System.out.println(JAWN);
        System.out.println(JAWN.getClub());
    }
}