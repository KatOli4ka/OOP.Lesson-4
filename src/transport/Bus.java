package transport;

public class Bus extends Transport {
    public Bus(String model, String brand, double engineVolume) {
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус ушел на пит-стоп");
    }
    @Override
    public double bestTime() {
        return Math.random()*15;
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*100);
    }
}
