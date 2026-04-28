abstract class ThreeDObject {
    abstract double sa();
    abstract double vol();
}

class Box extends ThreeDObject {
    double l,b,h;
    Box(double l,double b,double h){this.l=l;this.b=b;this.h=h;}
    double sa(){return 2*(l*b+b*h+h*l);}
    double vol(){return l*b*h;}
}

class Cube extends ThreeDObject {
    double a;
    Cube(double a){this.a=a;}
    double sa(){return 6*a*a;}
    double vol(){return a*a*a;}
}

class Cylinder extends ThreeDObject {
    double r,h;
    Cylinder(double r,double h){this.r=r;this.h=h;}
    double sa(){return 2*3.14*r*(r+h);}
    double vol(){return 3.14*r*r*h;}
}

class Cone extends ThreeDObject {
    double r,h;
    Cone(double r,double h){this.r=r;this.h=h;}
    double sa(){double l=Math.sqrt(r*r+h*h);return 3.14*r*(r+l);}
    double vol(){return (1.0/3)*3.14*r*r*h;}
}

public class 3D {
    public static void main(String[] args) {

        ThreeDObject obj;

        obj = new Box(2,3,4);
        System.out.println(obj.sa()+" "+obj.vol());

        obj = new Cube(5);
        System.out.println(obj.sa()+" "+obj.vol());

        obj = new Cylinder(3,7);
        System.out.println(obj.sa()+" "+obj.vol());

        obj = new Cone(3,7);
        System.out.println(obj.sa()+" "+obj.vol());
    }
}