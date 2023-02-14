package com.chuwa.springbasic.service.coupling;

import com.chuwa.springbasic.components.JpaChuwa;

public class LooseCoupling {
    private JpaChuwa jpaChuwa;

    public LooseCoupling(JpaChuwa jpaChuwa) {
        this.jpaChuwa = jpaChuwa;
    }

    public void printMessage() {
        jpaChuwa.printMessage();
    }
}
