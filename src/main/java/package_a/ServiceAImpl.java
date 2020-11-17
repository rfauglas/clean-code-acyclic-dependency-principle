package package_a;

import package_b.ServiceB;

public class ServiceAImpl {
    ServiceB serviceB;
    public void doA() {
        serviceB.doB();
    }
}
