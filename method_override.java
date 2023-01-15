class Add{
    public int calculate(int x,int y){
        return (x+y);
    }
}


class Sub extends Add{
    public int calculate(int x,int y){
        return (x-y);
    }

}

public class method_override{
    public static void main(String args[]){
        Add add = new Add();
        System.out.println(add.calculate(5,10));

        Add sub = new Sub();
        System.out.println(sub.calculate(10,5));

    }
}