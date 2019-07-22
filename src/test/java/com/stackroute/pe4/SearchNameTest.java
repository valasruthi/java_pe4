package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchNameTest {
    SearchName searchName;

    @Before
    public void setUp() throws Exception {
        this.searchName=new SearchName();
    }

    @After
    public void tearDown() throws Exception {
        searchName=null;
    }
    @Test
    public void givenNameShouldReturnTrue(){
        boolean expected=true;
        boolean actual=searchName.input("This is herry");
        assertEquals(expected,actual);
    }
    @Test
    public void givenNameShouldReturnFalse(){
        boolean expected=false;
        boolean actual=searchName.input("This is henry");
        assertEquals(expected,actual);
    }

}