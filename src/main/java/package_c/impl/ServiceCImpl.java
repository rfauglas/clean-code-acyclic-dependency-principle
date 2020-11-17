package package_c.impl;

import package_c.ServiceC;
import package_d.ServiceD;

public class ServiceCImpl implements ServiceC {
    ServiceD serviceD;

    @Override public void doC() {
        serviceD.doD();
    }

    @Override public void doC_2() {
    }

}
