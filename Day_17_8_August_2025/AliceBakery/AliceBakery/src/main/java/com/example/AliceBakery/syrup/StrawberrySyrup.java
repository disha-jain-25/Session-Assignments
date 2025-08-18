package com.example.AliceBakery.syrup;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawberrySyrup implements Syrup{

    @Override
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
