public class NumberLSP {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println("10-5=" + a.func(10, 5));
        System.out.println("6-10=" + a.func(6, 10));

        B1 b = new B1();
        //因为 B 类不再继承 A 类，因此调用者，不会再 func 是求减法 ,调用会很明确
        System.out.println("10-8=" + b.func(10, 8));
        System.out.println("10-50=" + b.func(10, 50));

        //使用组合仍然可以使用到 A 类相关方法
        System.out.println("18-6=" + b.func2(18, 6));
    }
}

//创建一个更加基础的基类
class Base {
    //把更加基础的方法和成员写到 Base 类
}

//类 A
class A1 extends Base {

    // 返回两个数的差
    public int func(int a, int b){
        return  a - b;
    }
}

class B1 extends Base {

    //如果 B 需要使用 A 类的方法,使用组合关系
    private A1 a = new A1();

    //重写了 A 类的方法, 可能是无意识
    public int func(int a, int b){
        return  a + b;
    }

    public int func2(int a, int b){
        return this.a.func(a, b);
    }
}