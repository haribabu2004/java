// create abstract class area amd it contains abstractb method find area of rectangle area of circle area of triangle
// Abstract class 'Area' with abstract methods
abstract class Area {
    abstract void findRectangleArea(double length, double width);
    abstract void findCircleArea(double radius);
    abstract void findTriangleArea(double base, double height);
}

// Concrete class 'College' with a display method
class College {
    void display() {
        System.out.println("SECE");
    }
}

// Concrete class 'NewStudent' (assuming it's supposed to be a different class)
class NewStudent extends College {
    void display() {
        System.out.println("Madhan");
    }
}

// Concrete class 'Dept' (assuming it's supposed to be a different class)
class Dept extends College {
    void display() {
        System.out.println("CCE");
    }
}

public class overload1 {
    // public static (String[] args) {
    //     // Creating objects of the 'NewStudent' and 'Dept' classes
        // NewStudent newStudent = new NewStudent();
        // Dept dept = new Dept();

        // Calling the 'display' method of the 'NewStudent' and 'Dept' classes
    //     newStudent.display();
    //     dept.display();
    // }
    public static void main (String[] args){

        NewStudent newStudent = new NewStudent();
        Dept dept = new Dept();
        newStudent.display();
        dept.display();

    }
}