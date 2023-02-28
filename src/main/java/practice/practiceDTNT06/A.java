package practice.practiceDTNT06;

public class A {

    public static void main(String[] args) {
        B b = new B();
        b.m();//Bad
        System.out.println(b.x);//20

        C c = new B();
        c.m();//Bad
        System.out.println(c.x);//10

        C d = new C();
        d.m();//Good
        System.out.println(d.x);//10

        D child = new D();
        System.out.println(child.x);//20
        System.out.println(child.sayı);//50
        child.m();//Bad

        C bebek = new D();
        System.out.println(bebek.x);//10 x'i bulabilmek için C class'ına baktık cünkü variable
        bebek.m();//Bad m(); 'i bulabilmek için D Class'ına baktık çünkü constructor
    }
}
