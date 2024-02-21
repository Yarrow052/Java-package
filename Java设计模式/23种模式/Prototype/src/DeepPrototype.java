import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author yyx
 */
public class DeepPrototype implements Cloneable, Serializable {
    String name;
    DeepClone deepClone;

//    //方式一：使用clone方法
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Object deep=null;
//        deep=super.clone();
//        //对引用数据类型的属性，进行单独处理
//        DeepPrototype deepPrototype=(DeepPrototype)deep;
//        deepPrototype.deepClone=(DeepClone) deepClone.clone();
//        return deepPrototype;
//    }

    //方式二：通过序列化的方式(推荐使用)
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//将当前的对象以对象流的方式输出

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deepPrototype = (DeepPrototype) ois.readObject();
            return deepPrototype;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
