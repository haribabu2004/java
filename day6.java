class cname{
    private int rollno=0;
    private String name,dept;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "cname [rollno=" + rollno + ", name=" + name + ", dept=" + dept + "]";
    }
    
    // public void setrollno(int rollno){
    //     this.rollno=rollno;
    // }

    // public void setname(String name){
    //     this.name=name;
    // }

    // public void setdept(String dept){
    //     this.dept=dept;
    // }

    // public int getrollno(){
    //     return rollno;
    // }

    // public String getname(){
    //     return name;
    // }

    // public String getdept(){
    //     return dept;
    // }
}



public class day6 {
    public static void main(String[] args) {
        cname obj=new cname();
        obj.setRollno(49);
        obj.setName("Siddarthan");
        obj.setDept("EEE");
        // System.out.println(obj.getRollno());
        // System.out.println(obj.getName());
        // System.out.println(obj.getDept());
        System.out.println(obj.toString());
    }
} 
