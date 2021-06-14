package structural.adapter;

import structural.adapter.classAdapter.ClassAdapter;
import structural.adapter.objectAdapter.ObjectAdapter;

public class Client {
    public static void main(String[] args) {
        Target target1 = new ClassAdapter();
        target1.request();

        Target target2 = new ObjectAdapter();
        target2.request();
    }
}
