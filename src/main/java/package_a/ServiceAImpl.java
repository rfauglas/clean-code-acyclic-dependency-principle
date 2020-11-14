package package_a;

import package_b.ServiceBImpl;

public class ServiceAImpl {
    ServiceBImpl serviceB;
    public void doA() {
        serviceB.doB();
    }
    public void doD() {
    }
}
