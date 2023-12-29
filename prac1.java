import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        HexatoBinary obj = new HexatoBinary();  
        obj.getVal();  
        obj.convert();  
        //function calling  
    }
}

class HexatoBinary  
{  
Scanner scan;  
int num;  
void getVal()  
{  
scan = new Scanner(System.in);  
System.out.print("Enter the number: ");  
num = Integer.parseInt(scan.nextLine(), 16);  
}  
void convert()  
{  
String binary = Integer.toBinaryString(num);  
System.out.println("Binary Value is: " + binary);  
}  
}  
