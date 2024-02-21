/**
 * Client（客户类）
 * 使用组合模式来创建和操作复合对象结构
 *
*/
public class Client {
    public static void main(String[] args) {
        Persion principal = new Principal("校长");
        Persion teacher1 = new Teacher("教师1");
        Persion teacher2 = new Teacher("教师2");
        Persion student1 = new Student("学生1");
        Persion student2 = new Student("学生2");
        Persion student3 = new Student("学生3");
        Persion student4 = new Student("学生4");

        principal.add(teacher1);
        principal.add(teacher2);
        teacher1.add(student1);
        teacher1.add(student2);
        teacher2.add(student3);
        teacher2.add(student4);

        info("无需", principal);
    }

    public static void info(String pre ,Persion persion){
        System.out.println(String.format("%s管理：%s", pre, persion.getName()));

        if(null == persion.getPersionList()){
            return;
        }
        for(Persion persion1 : persion.getPersionList()){
            info(persion.getName(), persion1);
        }

    }

}
