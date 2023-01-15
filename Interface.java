interface A{
    public void show();
}


interface C{
    public void show1();
}


class B implements A, C {
    public void show(){
        System.out.println("This is show()");
    }

    public void show1(){
        System.out.println("This is show1()");
    }

    public void display(){
        System.out.println("This is display()");
    }
}


public class Interface{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
        obj.show1();
        obj.display(); 

        A obj1 = new B(); // Using reference.
        obj1.show();

    }
}