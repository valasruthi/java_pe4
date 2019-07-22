package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringAlphabeticalTest {
    StringAlphabetical stringAlphabetical;

    @Before
    public void setUp() throws Exception {
        this.stringAlphabetical=new StringAlphabetical();
    }

    @After
    public void tearDown() throws Exception {
        stringAlphabetical=null;
    }
    @Test
    public void givenParagraphShouldSortTheWords(){
        String []expected="A,class,is,string".split("[\\s,]+");
        String []actual=stringAlphabetical.sortWordsInParagraph("A string is class");
        assertArrayEquals(expected,actual);
    }
    @Test
    public void givenParagraphShouldReturnNull(){
        String []actual=stringAlphabetical.sortWordsInParagraph(null);
        assertNull(actual);
    }
    }
