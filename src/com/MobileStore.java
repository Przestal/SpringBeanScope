package com;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MobileStore implements MethodReplacer {

    public String buyMobile(){
        return "Bought a Mobile Phone";

    }


    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "Bought an iPhone";
    }
}
