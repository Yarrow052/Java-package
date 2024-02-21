import java.util.List;

/**
 * Component（组件）
 *
 * 为组合中的对象声明接口
 * 声明一个接口用于访问和管理Component的子组件
 */

public abstract class Persion {
    private String name;
    protected List<Persion> persionList;

    public abstract void add(Persion persion);
    public abstract void delete(Persion persion);

    public void input() {
        System.out.println(String.format("name is %s", name));
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Persion> getPersionList() {
        return persionList;
    }
}
