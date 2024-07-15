package org.infyni.utility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathClassTest {

    @Test
    public void testAdd_WithBothPositive(){
        // Given
        int x = 10;
        int y = 20;
        // When
       int actual =  MathClass.add(x,y);

        // Then
        int expected = 30;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testAdd_WithBothNegative(){

    }

    @Test
    public void testAdd_withNegativeAndPositive(){

    }
}
