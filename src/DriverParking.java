public class DriverParking {
  public static void main(String[] args) {
      Car junior = new Car("205 junior");
      Car mercos = new Car("Benz");
      Car deuxCv = new Car("Deudeuche");
      Car volkswagen = new Car("Beetle");

      Moto concept = new Moto("Kenedal");
      Moto concept2 = new Moto ("Tetsuo");
      Moto harley = new Moto("Ponch");
      Moto harley2 = new Moto("Chopper");

      Truck livraison = new Truck("Partner");
      Truck monster = new Truck("Khamtarr");
      Truck benne = new Truck("Camion Benne");
      Truck mercoTruck = new Truck("Mercedes");

      Parking park1 = new Parking();
      park1.parkVehicule1(concept);
      park1.parkVehicule2(junior);
      park1.parkVehicule3(monster);
      park1.parkVehicule4(harley);

      park1.honkAllVehicules();
      park1.startAllVehicules();
      park1.stopAllVehicules();

    }
}
