package com.cursor.service;

import com.cursor.controller.Discriminant;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class DiscriminantServiceTest {

    @Test
    void methodTest() {

        //GIVEN
        long a = 20;
        long b = 30;
        long c = 10;

        int expectResult = 100;


        //WHEN

        //THEN
        long actualResult = Discriminant.calculatedDiscriminant(a, b, c);

        Assert.assertEquals(expectResult, actualResult);
    }
}