package transport;

public class Truck extends Transport {
    public Truck(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void end() {
        super.end();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик ушел на пит-стоп");
    }

    @Override
    public double bestTime() {
        return Math.random()*10;
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*150);
    }
}
