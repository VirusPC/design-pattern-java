package structural.adapter;

/**
 * 被适配类, 具有特殊功能, 但不匹配Target接口
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee specificRequest 功能被调用...");
    }
}
