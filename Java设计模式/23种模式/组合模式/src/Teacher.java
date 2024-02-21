import java.util.ArrayList;

/**
 * Composite（树枝节点构件）
 *
 * 实现了在抽象构件中定义行为，包括那些访问及管理子构件对方法
 * 存储子部件
 *
 */
public class Teacher extends Persion {
    public Teacher(String name) {
        setName(name);
        persionList = new ArrayList<Persion>();
    }

    @Override
    public void add(Persion persion) {
        persionList.add(persion);
    }

    @Override
    public void delete(Persion persion) {
        persionList.remove(persion);
    }
}
