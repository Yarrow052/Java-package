public class DependecyDIP {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

class Person {
    //这里我们是对接口的依赖
    public void receive(IReceiver receiver ) {
        System.out.println(receiver.getInfo());
    }
}

//增加微信
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: hello,world";
    }
}

class Email implements IReceiver {
    public String getInfo() {
        return "邮件信息: hello,world";
    }
}

//定义接口
interface IReceiver {
    public String getInfo();
}

