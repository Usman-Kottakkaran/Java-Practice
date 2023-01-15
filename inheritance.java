class student{
    int std_id;
    void showStudentInfo(){
        System.out.println("Student Id:" +std_id);

    }
}

class teacher extends student{
    String std_name;
    void showTeacherInfo(int m1,int m2){
        System.out.println("Student name:" +std_name);
        System.out.println("Student mark:" +(m1+m2));

    }
}


public class inheritance{
    public static void main(String args[]){
        student std = new student();
        std.std_id= 467;
        std.showStudentInfo();
        teacher t1= new teacher();
        t1.std_name= "Usman";
        t1.showTeacherInfo(80, 80);
        t1.std_id= 123;
        t1.showStudentInfo();

    }

}