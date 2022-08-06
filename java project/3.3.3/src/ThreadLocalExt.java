/**
 * @author yyx
 * @description: TODO
 * @date 2022/8/6 14:10
 */
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}