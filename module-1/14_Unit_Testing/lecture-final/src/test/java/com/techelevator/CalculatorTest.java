package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {


    private Calculator calc;

    //no main methods



    // This is the best place for test setup or initialization of the class under test (Caclulator)
    @Before
    public void setup() {

        calc = new Calculator();
        System.out.println("Before");

    }


    @Test
    public void testAddingTwoPositiveNumbers() {

        Assert.assertEquals(3, calc.add(1,2));
        Assert.assertEquals(25, calc.add(5,20));

    }

    @Test
    public void test_adding_two_negative_numbers() {
        Assert.assertEquals(-3, calc.add(-1,-2));
        Assert.assertEquals(-25, calc.add(-5,-20));

    }

    @Test
    public void test_adding_one_negative_and_one_positive_numbers() {
        Assert.assertEquals(19, calc.add(-1,20));
        Assert.assertEquals(-15, calc.add(5,-20));
    }

    @Test
    public void test_adding_zeros() {
        Assert.assertEquals("Expected 20 but actual was: " + calc.add(0,20), 20, calc.add(0,20));
        Assert.assertEquals(5, calc.add(5,0));
        Assert.assertEquals(0, calc.add(0,0));
    }

    /*
    public Result add (Request nums)
     */
    @Test
    public void test_addingTwoObjectsPositiveNumbers() {

        //ARRANGE
        Request one = new Request(2,3);
        Request two = new Request(5,10);

        //ACT
        Result rOne = calc.add(one);
        Result rTwo = calc.add(two);

        //ASSERTS
        Assert.assertEquals(5, rOne.getResult());
        Assert.assertEquals(15, rTwo.getResult());

        System.out.println(rOne.toString());

    }

    @Test
    public void test_is_A_greater_than_B_is_True() {

        Assert.assertTrue(calc.isAGreaterThanB(4,3));
    }

    @Test
    public void test_is_A_greater_than_B_is_False() {

        Assert.assertFalse(calc.isAGreaterThanB(2,3));
    }

    @Test
    public void test_is_null() {
        Assert.assertNull(calc.returnNull());
    }






    @After
    public void teardown() {


        System.out.println("After");

    }





}
