public class threadjava extends Thread {
    public void run(){
        System.out.println("OK Thread");
    }
    public static void main(String[] args) {
        threadjava obj=new threadjava();
        obj.start();
    }
}
