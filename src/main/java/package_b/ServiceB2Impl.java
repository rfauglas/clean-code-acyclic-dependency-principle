package package_b;

import package_c.ServiceC2Impl;
import package_c.ServiceCImpl;

public class ServiceB2Impl {
    private ServiceCImpl serviceC;
    private ServiceC2Impl serviceC2;

    public void doB2() {

    }

    public void doB2_2() {
        serviceC.doC();
    }

    public void doB2_3() {
        serviceC2.doC2();
    }
}
