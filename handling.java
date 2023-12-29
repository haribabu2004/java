public class handling {
    public static void main(String args[]) throws Exception{
       try{
            int a[]=new int[5];
            a[8]=80;
       }
       catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
       }
       catch(ArithmeticException e){
            System.out.println(e);
       }
       finally{
        System.out.println("Finally always executed");
       }
        // System.out.println(num);
        System.out.println("Expention handled");

    }
}
