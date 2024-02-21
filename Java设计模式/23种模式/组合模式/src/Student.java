/**
 * Leaf（叶子构件）
 *
 * 叶子构件在组合结构中表示叶子节点对象，叶子节点没有子节点
 * 对于那些访问及管理子构件的方法，可以通过异常等方式进行处理
 */
public class Student extends Persion{
    public Student(String name) {
        setName(name);
        persionList = null;
    }

    @Override
    public void add(Persion persion) {
    }

    @Override
    public void delete(Persion persion) {
    }
}
