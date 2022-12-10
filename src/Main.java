import transport.Bus;
import transport.Car;
import transport.PassangerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1. Задание 1");
        PassangerCar lada = new PassangerCar("Granta", "Lada",1.6);
        PassangerCar bmw = new PassangerCar("BMW", "Z8",1.9);
        PassangerCar kia = new PassangerCar("Kia", "Sportage",1.7);
        PassangerCar subaru = new PassangerCar("Subaru", "Forester",1.5);
        Truck fl=new Truck("FL-D5K","Volvo",2.4);
        Truck fe=new Truck("FE-G9K320","Volvo",8.9);
        Truck fm=new Truck("FM-D8K","Volvo",6.0);
        Truck fh=new Truck("FH--D13K","Volvo",12.8);
        Bus liaz=new Bus("5256", "ЛиАЗ",5.8);
        Bus ikarus=new Bus("280", "Ikarus",8.0);
        Bus paz=new Bus("5411","ПАЗ",6.1);
        Bus scania=new Bus("125","Scania",6.8);
        System.out.println(lada.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(subaru.toString());
        System.out.println(fl.toString());
        System.out.println(fe.toString());
        System.out.println(fm.toString());
        System.out.println(fh.toString());
        System.out.println(liaz.toString());
        System.out.println(ikarus.toString());
        System.out.println(paz.toString());
        System.out.println(scania.toString());
        System.out.println(scania.equals(fe));
        lada.end();
        liaz.start();

    }
}