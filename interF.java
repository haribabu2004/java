interface find {
    void vol();
}
interface check {
    void volume();
}
class display implements find,check {
    public void vol() {
        System.out.println(0.33*3.14*3*3);
    }
    public void volume() {
        System.out.println(3.14*3*3*5);
    }
}
class interF {
    public static void main(String[] args) {
        display obj=new display();
        obj.vol();
        obj.volume();
    }
}


