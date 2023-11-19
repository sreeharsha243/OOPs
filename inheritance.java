//code reusability
//mutiple inheritance can be used by interfaces


class shape{ //parent
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends shape{ //single level inheritance
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Equilateral extends Triangle{ //multi level inheritance
    public void area(int l,int h){
        System.out.println(1/2*l*h )
    }
}

class circle extends shape{ //hierarchy inheritance
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class inheritance{
    public static void main(String args[]){
        Triangle t1=new Triangle();
    }
}