/**
 * @author yyx
 */
public class Client {
//    public static void main(String[] args) {
//        Sheep sheep = new Sheep("DuoLi", 5, "白色");
//        sheep.friend=new Sheep("haha",6,"黑色");
//        Sheep sheep1 = (Sheep) sheep.clone();
//        Sheep sheep2 = (Sheep) sheep.clone();
//        Sheep sheep3 = (Sheep) sheep.clone();
//
//        System.out.println("sheep1=" + sheep1);
//        System.out.println("sheep2=" + sheep2);
//        System.out.println("sheep3=" + sheep3);
//
//        System.out.println("sheep4="+sheep1+";sheep4 friend="+sheep1.friend.hashCode());
//        System.out.println("sheep5="+sheep2+";sheep5 friend="+sheep2.friend.hashCode());
//    }

//    public static void main(String[] args) {
//        DeepPrototype p=new DeepPrototype();
//        p.name="haha";
//        p.deepClone=new DeepClone("xixi","xixi.class");
//        DeepPrototype p1 = null;
//        try {
//            p1= (DeepPrototype) p.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("name="+p.name+";deepClone="+p.deepClone.hashCode());
//        System.out.println("name="+p1.name+";deepClone="+p1.deepClone.hashCode());
//    }

    public static void main(String[] args) {
        DeepPrototype p=new DeepPrototype();
        p.name="haha";
        p.deepClone=new DeepClone("xixi","xixi.class");

        DeepPrototype p2= (DeepPrototype) p.deepClone();
        System.out.println("name="+p.name+";deepCloneableTarget="+p.deepClone.hashCode());
        System.out.println("name="+p2.name+";deepCloneableTarget="+p2.deepClone.hashCode());
    }
}

