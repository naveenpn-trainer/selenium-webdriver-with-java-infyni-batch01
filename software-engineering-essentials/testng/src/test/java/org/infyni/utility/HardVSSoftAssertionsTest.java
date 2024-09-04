package org.infyni.utility;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSSoftAssertionsTest {

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testOne(){
        System.out.println("testOne-I");
        Assert.assertTrue(false);
        System.out.println("testOne-II");
        Assert.assertTrue(true);
    }

    @Test
    public void testTwo(){
        System.out.println("testTwo-I");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false,"Message01");
        softAssert.assertTrue(true,"Message02");
        softAssert.assertTrue(true,"Message02");
        System.out.println("testTwo-II");
        softAssert.assertAll();

    }
}
