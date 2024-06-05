package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

    private DateFashion dateFashion;

    @Before
    public void setup() {

        dateFashion = new DateFashion();

    }

    @Test
    public void testDateFashionHappyPath() {

        Assert.assertEquals(0, dateFashion.getATable(1,9));
        Assert.assertEquals(0, dateFashion.getATable(9, 1));
        Assert.assertEquals(1, dateFashion.getATable(3, 6));
        Assert.assertEquals(1, dateFashion.getATable(6, 3));
        Assert.assertEquals(2, dateFashion.getATable(9, 5));
        Assert.assertEquals(2, dateFashion.getATable(5, 9));

    }

    @Test
    public void testDateFashionEdgeCases() {

        Assert.assertEquals(0, dateFashion.getATable(2, 5));
        Assert.assertEquals(0, dateFashion.getATable(5, 2));
        Assert.assertEquals(2, dateFashion.getATable(8, 5));
        Assert.assertEquals(2, dateFashion.getATable(5, 8));

    }

    @Test
    public void testDateFashionErrorConditions() {

        Assert.assertEquals(, );
        Assert.assertEquals(, );

    }

    @After
    public void teardown() {
    }
}
