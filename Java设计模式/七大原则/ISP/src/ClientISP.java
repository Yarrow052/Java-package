public class ClientISP {
    public static void main(String[] args) {
        A a = new A();
        a.b1(new B()); // A 类通过接口去依赖 B 类
        a.b2(new B());
        a.b3(new B());

        System.out.println("-----------------------");

        C c = new C();
        c.d1(new D()); // C 类通过接口去依赖(使用)D 类
        c.d2(new D());
        c.d3(new D());
    }
}

//A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法
class A {

    public void b1(Interface1 i) {
        i.run1();
    }

    public void b2(Interface2 i) {
        i.run2();
    }

    public void b3(Interface2 i) {
        i.run3();
    }
}

//C 类通过接口 Interface1 依赖(使用) D 类，但是只会用到 1,4,5 方法
class C {

    public void d1(Interface1 i) {
        i.run1();
    }

    public void d2(Interface3 i) {
        i.run4();
    }

    public void d3(Interface3 i) {
        i.run5();
    }
}


//接口
interface Interface1 {
    void run1();
}

interface Interface2 {
    void run2();
    void run3();
}

interface Interface3 {
    void run4();
    void run5();
}

class B implements Interface1, Interface2 {

    public void run1() {
        System.out.println("B 实现了 run1");
    }

    public void run2() {
        System.out.println("B 实现了 run2");
    }

    public void run3() {
        System.out.println("B 实现了 run3");
    }

    public void run4() {
        System.out.println("B 实现了 run4");
    }

    public void run5() {
        System.out.println("B 实现了 run5");
    }
}

class D implements Interface1, Interface3 {

    public void run1() {
        System.out.println("D 实现了 run1");
    }

    public void run2() {
        System.out.println("D 实现了 run2");
    }

    public void run3() {
        System.out.println("D 实现了 run3");
    }

    public void run4() {
        System.out.println("D 实现了 run4");
    }

    public void run5() {
        System.out.println("D 实现了 run5");
    }
}
