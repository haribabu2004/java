public class threadja extends Thread{
    // public void run(){
    //     System.out.println("OK Thread");
    // }
    public static void main(String[] args) {
        threadja obj=new threadja();
        obj.start();
        System.out.println("java");
    }


}