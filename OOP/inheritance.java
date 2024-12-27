
class Plane {
    void fly() {
        System.out.println("Flying a plane");
    }

    void refuel() {
        System.out.println("Refueling the plane");
    }
}


class Jet extends Plane {
    @Override
    void fly() {
        System.out.println("Flying a jet");
    }

    @Override
    void refuel() {
        System.out.println("Refueling jet fuel");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Flying a cargo plane");
    }

    @Override
    void refuel() {
        System.out.println("Refueling cargo plane with diesel");
    }
}


class ElectricPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Flying an electric plane");
    }

    @Override
    void refuel() {
        System.out.println("Charging electric plane");
    }
}

public class inheritance {
    public static void main(String[] args) {
       
        Plane myJet = new Jet();
        Plane myCargoPlane = new CargoPlane();
        Plane myElectricPlane = new ElectricPlane();

        
        myJet.fly(); 
        myJet.refuel(); 

        myCargoPlane.fly();   
        myCargoPlane.refuel();    

        myElectricPlane.fly(); 
        myElectricPlane.refuel();  
    }
}
