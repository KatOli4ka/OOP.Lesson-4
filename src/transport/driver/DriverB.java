package transport.driver;

import transport.Car;

import java.net.CacheRequest;

public class DriverB extends Driver<Car>{
    public DriverB(String fio, boolean hasDriveLicense, int expirience) {
        super(fio, hasDriveLicense, expirience);
    }

    @Override
    public void start(Car transport) {
        transport.start();
    }

    @Override
    public void stop(Car transport) {
        transport.end();
    }
    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель - "+getFio()+" заправляет "+transport.getBrand());
    }
}
