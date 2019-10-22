package com.seagle.matthew;

import org.junit.Assert;
import org.junit.Test;



public class BasicTalkingClassTest {

    private BasicTalkingClass btc = new BasicTalkingClass();

    @Test
    public void TestSayHah() {
        Assert.assertEquals(btc.sayHah(), btc.sayHah());
    }
}
