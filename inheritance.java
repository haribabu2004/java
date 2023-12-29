
class stud{
    int num;
}
class college extends stud{
    String c_name;
    void display(){
        System.out.println(num+" "+c_name);
    }
}

public class inheritance {
    public static void main(String[] a){
        college obj=new college();
        obj.num=9;
        obj.c_name="CCE";
        obj.display();
    }
}
