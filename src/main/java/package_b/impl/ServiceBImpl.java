package package_b.impl;

import package_b.ServiceB;
import package_b.ServiceB2;
import package_c.ServiceC;

public class ServiceBImpl implements ServiceB {
    ServiceC serviceC;
    ServiceB2 serviceB2;

    @Override public void doB() {
        serviceC.doC();
    }

    @Override public  void doB_2() {
        serviceB2.doB2();
    }

}
