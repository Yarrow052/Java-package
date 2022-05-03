public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start(); //启动thread线程
            thread.sleep(1000); //main线程首先等待1S，目的是让thread线程首先启动
            thread.interrupt(); //设置中断标识
            System.out.println("是否停止1？ = "+ thread.interrupted()); //获取中断标志
            System.out.println("是否停止2？ = "+ thread.interrupted());//这里是静态方法
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

        System.out.println("end!");
    }
}