package com.example.AliceBakery;

import com.example.AliceBakery.frosting.Frosting;
import com.example.AliceBakery.syrup.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    @Autowired
    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking a cake with "
                + frosting.getFrostingType()
                + " and "
                + syrup.getSyrupType() + "!");
    }
}
