public abstract class Avion {
    protected String planeID;

    public Avion(String planeID) {
        this.planeID = planeID;
    }

    public void takeOff() {
        System.out.println(planeID + " - Taking off");
    }

    public void fly() {
        System.out.println(planeID + " - Flying");
    }

    public void land() {
        System.out.println(planeID + " - Landing");
    }
}