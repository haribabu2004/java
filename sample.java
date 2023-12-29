class rectangle{
    int rad;
    int bre;
    rectangle(int rad){
        this.rad=rad;
    }
    void area(){
        System.out.println("Area is "+3.14*rad*rad);
    }
    void perimeter(){
        System.out.println("Perimeter is "+ 2*3.14*rad);
    }
}

public class sample {
    public static void main(String[] a){
        rectangle obj=new rectangle(10);
        obj.area();
        obj.perimeter();
    }
}
