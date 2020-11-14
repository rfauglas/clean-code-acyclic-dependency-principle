package package_c;

import package_a.ServiceAImpl;

public class ServiceCImpl {
    ServiceAImpl serviceA;

    public void doC() {
        serviceA.doD();
    }
}
