package structural.adapter.classAdapter;

import structural.adapter.Adaptee;
import structural.adapter.Target;

/**
 * 核心, 继承具有目标功能的类, 同时实现目标接口
 */
public class ClassAdapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}
