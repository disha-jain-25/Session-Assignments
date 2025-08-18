package com.example.AliceBakery.frosting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
