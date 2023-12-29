// class Area
// {
//     float rad;
//     void find(){
//         System.out.print(3.14*rad*rad);
//     }
// }
// public class day4{
//     public static void main(String a[]){
//         Area ar=new Area();
//         ar.rad=112.3f;
//         ar.find();
        
//     }
// }

import java.util.Scanner;

class volume{
    float rad;
    float find(float rad,int he){
        return(float) (3.14*(rad*rad*he));
    }
}
public class day4{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        float rad=s.nextFloat();
        int he=s.nextInt();
        volume a=new volume();
        System.out.println(a.find(rad,he));
        s.close();
    }

}
// class volume{
   
// }

