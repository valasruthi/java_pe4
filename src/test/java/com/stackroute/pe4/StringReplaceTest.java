package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {
      StringReplace stringReplace;
    @Before
    public void setUp() throws Exception {
        this.stringReplace=new StringReplace();
    }

    @After
    public void tearDown() throws Exception {
        stringReplace=null;
    }
    @Test
    public void replaceCharacters() {
        String expexted="faity fry";
        String actual=stringReplace.replaceWord("daily dry");
        assertEquals(expexted,actual);

    }

    @Test
    public void replaceCharactersNotNull() {
        String actual=stringReplace.replaceWord("daily dry");
        assertNotNull(actual);

    }
    @Test
    public void replaceCharactersNull() {
        String actual=stringReplace.replaceWord(null);
        assertNull(actual);

    }
}