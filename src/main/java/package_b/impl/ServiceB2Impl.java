package package_b.impl;

import package_b.ServiceB2;
import package_c.ServiceC2;
import package_c.ServiceC;

public class ServiceB2Impl implements ServiceB2 {
    private ServiceC serviceC;
    private ServiceC2 serviceC2;

    @Override public void doB2() {

    }

    @Override public void doB2_2() {
        serviceC.doC();
    }

    @Override public void doB2_3() {
        serviceC2.doC2();
    }
}
