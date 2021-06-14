package structural.adapter;

/**
 * 目标接口, 客户端只能通过这个接口调用request方法.
 * 然而, 具有目标功能的 Adaptee 类与这个接口不匹配.
 * 所以, 需要适配器来适配`
 */
public interface Target {
    public void request();
}
