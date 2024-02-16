public class Car implements Vehicule{
    private String name;
    public Car(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void start() {
        System.out.println(this.getName() + " Car Started");
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " Car Stopped");
    }

    @Override
    public void honk(){
        System.out.println(this.getName() + " Honk");
    }
}
