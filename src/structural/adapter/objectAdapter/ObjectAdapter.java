package structural.adapter.objectAdapter;

import structural.adapter.Target;
import structural.adapter.Adaptee;

/**
 * 核心, 继承具有目标功能的类, 同时实现目标接口
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter() {
        this.adaptee = new Adaptee();
    }

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
