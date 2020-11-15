package package_b;

import package_c.ServiceCImpl;

public class ServiceBImpl {
    ServiceCImpl serviceC;
    ServiceB2Impl  serviceB2;

    public void doB() {
        serviceC.doC();
    }

    public  void doB_2() {
        serviceB2.doB2();
    }

}
