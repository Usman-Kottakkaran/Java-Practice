abstract class Car{
    abstract void start();
    abstract void accelarate();
    abstract void stop();
}

class Nanocar extends Car{
    void start(){
        System.out.println("Starting nano car");
    }

    void accelarate(){
        System.out.println("Accelarating nano car");
    }

    void stop(){
        System.out.println("Stoping nano car");
    }
}


class Altocar extends Car{
    void start(){
        System.out.println("Starting alto car");
    }

    void accelarate(){
        System.out.println("Accelarating alto car");
    }

    void stop(){
        System.out.println("Stoping alto car");
    }
}

public class AbstractExample{
    public static void main(String args[]){
        Car c1 = new Nanocar();
        Car c2 = new Altocar();
        c1.start();
        c1.accelarate();
        c1.stop();
        c2.start();
        c2.accelarate();
        c2.stop();
    }
}