class Calculate{
    public int add(int x,int y){
        int sum=x+y;
        return sum;
    }

    public int add(int x, int y, int z){
        int sum=x+y+z;
        return sum;
    }
}


public class method_overload{
    public static void main(String args[]){

        Calculate obj = new Calculate();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }

}