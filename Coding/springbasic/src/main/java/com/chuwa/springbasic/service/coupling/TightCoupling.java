package com.chuwa.springbasic.service.coupling;

import com.chuwa.springbasic.components.impl.HibernateChuwa;

public class TightCoupling {
    private HibernateChuwa hibernateChuwa = new HibernateChuwa();

    public void printMessage() {
        hibernateChuwa.printMessage();
    }
}
