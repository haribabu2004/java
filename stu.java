class student{
    int rno;
    String name;
    String dept;
    student(int siv,String nih,String ney){
        rno=siv;
        name=nih;
        dept=ney;
    }
   void print(){
       System.out.print(rno +" "+ name + " " + dept);
   }
}
public class stu{
    public static void main(String[]args){
        student s=new student(101,"x","y");
        s.print();
    }
}   
