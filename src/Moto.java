public class Moto implements Vehicule{
    private String name;

    public Moto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println(this.getName() + " Moto Started");
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " Moto stopped");
    }

    @Override
    public void honk() {
        System.out.println(this.getName() + " Beep");

    }
}
