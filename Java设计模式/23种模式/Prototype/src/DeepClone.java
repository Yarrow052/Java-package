import java.io.Serializable;

/**
 * @author yyx
 */
public class DeepClone implements Cloneable, Serializable {
    private static final long serialVersionUID=1L;
    private String name;
    private String age;

    public DeepClone(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
