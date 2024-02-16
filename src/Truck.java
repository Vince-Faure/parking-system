public class Truck implements Vehicule {
    private String name;

    public Truck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println(this.getName() + " Truck Started");
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " Truck stopped");
    }

    @Override
    public void honk() {
        System.out.println(this.getName() + " TOOT");
    }
}
