package package_b;

import package_c.ServiceCImpl;

public class ServiceBImpl {
    ServiceCImpl serviceC;
    public void doB() {
        serviceC.doC();
    }
}
