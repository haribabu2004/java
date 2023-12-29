public class overload{
    public static void main(String[] args) {
        over o=new over();
    //     o.sum(4,5);
    //     System.out.println(o.sum(1,2));
    //     System.out.println(o.sum(5.95f,7.23f));
    //    System.out.println( o.sum(5.2345,99.23454));
        o.area(6,7);
        o.area(5);
    }
}

class over{
    void area(int l,int b){
        System.out.println("Area of rectangle: "+(l*b));
    }

    void area(int r){
        System.out.println("Area of circle: "+(3.14*r*r));
    }
    //  void sum(int num1,int num2){
    //    System.out.println((num1+num2));
    // }

    // int sum(int num1,int num2){
    //     return(num1+num2);
    // }
    
    // float sum(float n1,float n2){
    //     return (n1+n2);
    // }

    //  double sum(double n1,double n2){
    //     return (n1+n2);
    // }
}