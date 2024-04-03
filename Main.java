public class Main {
    public static void main(String[] args) {
        Avion calator1 = new AvionDeCalatori("Boeing777");
        Avion lupta1 = new AvionDeLupta("Mig29");

        calator1.takeOff();
        lupta1.fly();
        ((AvionDeLupta) lupta1).launchMissile();
        calator1.land();
    }
}