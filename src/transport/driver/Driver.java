package transport.driver;

import transport.Transport;

public abstract class Driver<A extends Transport> {
    private final String fio;
    private boolean hasDriveLicense;
    private int expirience;

    public Driver(String fio, boolean hasDriveLicense, int expirience) {
        this.fio = fio;
        this.hasDriveLicense = hasDriveLicense;
        this.expirience = expirience;
    }

    public String getFio() {
        return fio;
    }

    public boolean isHasDriveLicense() {
        return hasDriveLicense;
    }

    public void setHasDriveLicense(boolean hasDriveLicense) {
        this.hasDriveLicense = hasDriveLicense;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public abstract void start(A transport);

    public abstract void stop(A transport);

    public abstract void refuel(A transport);

    public void printInfo(A transport) {
        System.out.println("Водитель - "+fio+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }
}
