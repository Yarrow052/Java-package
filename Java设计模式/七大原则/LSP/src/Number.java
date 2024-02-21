public class Number {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("10-5=" + a.func(10, 5));
        System.out.println("6-10=" + a.func(6, 10));
        System.out.println("-----------------------");
        B b = new B();
        //本意是求出 11-3 和 1-8 但是由于重写改变了之前的职责
        System.out.println("10-8=" + b.func(10, 8));
        System.out.println("10-50=" + b.func(10, 50));
    }
}

//类 A
class A {

    // 返回两个数的差
    public int func(int a, int b) {
        return a - b;
    }
}

class B extends A {

    //重写了 A 类的方法, 可能是无意识
    public int func(int a, int b) {
        return a + b;
    }
}
