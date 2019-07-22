package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;

    @org.junit.Before
    public void setUp() throws Exception {
        this.stringCount=new StringCount();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        stringCount=null;
    }
   @Test
    public void givenStringShouldReturnTheCharacterCount(){
        int actualResult=stringCount.charData('a');
        assertEquals(5,actualResult);
    }

    @Test
    public void characterCountFailure() {
        int actual=stringCount.charData('J');
        assertNotEquals(10,actual);
    }

    @Test
    public void characterCountNotNull() {
        int actual=stringCount.charData('J');
        assertNotNull(actual);
    }

}