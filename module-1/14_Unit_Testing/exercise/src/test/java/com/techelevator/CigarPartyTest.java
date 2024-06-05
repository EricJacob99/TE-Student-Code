package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

private CigarParty cigarParty;

    @Before
    public void setup() {

        cigarParty = new CigarParty();

    }

    @Test
    public void testCigarPartyHappyPath() {

        Assert.assertEquals(true, cigarParty.haveParty(50, false));
        Assert.assertEquals(true, cigarParty.haveParty(100, true));

    }

    @Test
    public void testCigarPartyEdgeCases() {

        Assert.assertEquals(true, cigarParty.haveParty(40, false));
        Assert.assertEquals(true, cigarParty.haveParty(60, false));
        Assert.assertEquals(true, cigarParty.haveParty(40, true));

    }

    @Test
    public void testCigarPartyErrorConditions() {

        Assert.assertEquals(false, cigarParty.haveParty(30, false));
        Assert.assertEquals(false, cigarParty.haveParty(30, true));
        Assert.assertEquals(false, cigarParty.haveParty(70, false));

    }

    @After
    public void teardown() {
    }
}
