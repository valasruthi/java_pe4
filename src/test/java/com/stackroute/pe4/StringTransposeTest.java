package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;
    @Before
    public void setUp() throws Exception {
        this.stringTranspose=new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose=null;
    }
    @Test
    public void givenStringShouldTranspose(){
        String expected="YM EMAN SI IHTURS";
        String actual=stringTranspose.transpose("MY NAME IS SRUTHI");
        assertEquals(expected,actual);
    }
    @Test
    public void givenStringShouldNull(){
        String actual=stringTranspose.transpose(null);
        assertNull(actual);
    }

}
