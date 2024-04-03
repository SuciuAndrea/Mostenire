public class AvionDeLupta extends Avion {
    public AvionDeLupta(String planeID) {
        super(planeID);
    }

    public void launchMissile() {
        System.out.println(getPlaneID() + " - Launching missile");
    }
}