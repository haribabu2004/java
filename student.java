dclass stu{
    String name="haribabu";
     void display(){
            System.out.println(name);
    }
}

    class dept extends stu{

        String name="fdg";
        void display(){c
            System.out.println(name+super.name);        }
    }

public class student {
        public static void main(String[] args){
            dept d=new dept();
            // d.name="BigilSiva";
            d.display();
            // System.out.println(super.name);
        }

        public void display() {
        }
    }
    

