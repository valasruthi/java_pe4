package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;

public class StringMatchTest {
       StringMatch stringMatch;
    @Before
    public void setUp() throws Exception {
        this.stringMatch=new StringMatch();
    }

    @After
    public void tearDown() throws Exception {
        stringMatch=null;
    }
    @Test
    public void matching() {
        String expected="Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";
        String actual=stringMatch.matching("She sells seashells by the seashore","se");
        assertEquals(expected,actual);
    }
    @Test
    public void matchingNotNull() {

        String actual=stringMatch.matching("She sells seashells by the seashore","se");
        assertNotNull(actual);
    }
}