import java.util.Scanner;

public class Daay3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        vol obj=new vol();
        obj.volcone(10, 5);
        obj.volcyl(7, 8);
        s.close();
    }
}

class vol{
    void volcone(int r,int h){
        System.out.println("The volume of cone: "+3.14*r*r*h*1/3);
    }
    void volcyl(int r,int h){
        System.out.println("The voume of cylinder: "+3.14*r*r*h);
    }
}