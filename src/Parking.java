public class Parking {
    private Vehicule spot1;
    private Vehicule spot2;
    private Vehicule spot3;
    private Vehicule spot4;

    void parkVehicule1(Vehicule vehicule) {
        this.spot1 = vehicule;
    }

    void parkVehicule2(Vehicule vehicule) {
        this.spot2 = vehicule;
    }

    void parkVehicule3(Vehicule vehicule) {
        this.spot3 = vehicule;
    }
    void parkVehicule4(Vehicule vehicule) {
        this.spot4 = vehicule;
    }

    void startAllVehicules() {
        if (this.spot1 != null && this.spot2 != null && this.spot3 != null && this.spot4 != null){
            this.spot1.start();
            this.spot2.start();
            this.spot3.start();
            this.spot4.start();
        }
    }

    void stopAllVehicules() {
        if (this.spot1 != null && this.spot2 != null && this.spot3 != null && this.spot4 != null){
            this.spot1.stop();
            this.spot2.stop();
            this.spot3.stop();
            this.spot4.stop();
        }
    }

    void honkAllVehicules(){
        if (this.spot1 != null && this.spot2 != null && this.spot3 != null && this.spot4 != null){
            this.spot1.honk();
            this.spot2.honk();
            this.spot3.honk();
            this.spot4.honk();
        }
    }
}
