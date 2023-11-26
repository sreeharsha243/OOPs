//used for method hiding

//before java 8 we can achieve 100% abstraction using interfaces
//after that using interfaces or abstract classes we may or may not achieve 100% abstraction, it depends on user
//interfaces use for run time polymorphism

abstract class Super //if a class contain one abstract method then it is abstract class
{
    public void meth(){
        System.out.println("super");
    }
    void meth1(){
        System.out.println("super meth1");
    }
    abstract void meth2();//abstract method
}
class sub extends Super 
{
    void meth2(){ //overriding by doing it,the sub class will be abstract
        System.out.println("sub meth2");
    }
}

interface Test{
    void meth1();
    void meth2();
}

class My implements Test{ //if class want to implement interfaces it should be abstract or override all methods
    public void meth1(){
        System.out.println("meth1 of my");
    }
    public void meth2(){
        System.out.println("meth2 of my");
    }
    public void meth3(){
        System.out.println("meth3 of my");
    }

}

public class Abstraction{
    public static void main(String args[]){
        Super s=new sub();
        s.meth1();
        s.meth2();

        Test t=new My();
        t.meth1();
        t.meth2();
    }
}