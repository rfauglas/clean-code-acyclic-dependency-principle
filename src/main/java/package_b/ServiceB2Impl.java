package package_b;

import package_c.ServiceCImpl;

public class ServiceB2Impl {
    private ServiceCImpl serviceC;

    public void doB2() {

    }

    public void doB2_2() {
        serviceC.doC_2();
    }
}
