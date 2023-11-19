class pen{
    String color;
    String type; // ball or gel pen

    public void write(){
        System.out.println("Writing Something ");
    }
    public void color(){
        System.out.println(this.color);
    }
}

class student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    student(){
        System.out.println("constructer called");//non-parameterized constructor
    }

    student(String name,int age){
        this.name=name;
        this.age=age;
    }//parameterized consrtuctor

    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
    }//copy constructor

    //destructor is called as garbage collector in java it is done AUTOMATICALLY
}

public class oops{
    public static void main(String args[]){
        /*pen p=new pen(); //Object of pen class
        p.color="blue";
        p.type="gel";
        p.write();

        pen p1=new pen();
        p1.color="black";
        p1.type="ball";

        p.color();
        p1.color();*/

        student s=new student(); //non-parametarized constructor
        s.name="harsha";
        s.age=20;

        s.printName();

        student s1=new student("cherry",22); //parametarized constructor
        s1.printName();

        student s2=new student(s1);
        s2.printName();
    }

}