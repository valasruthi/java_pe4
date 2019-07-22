package com.stackroute.pe4;
import java.util.*;
public class StringAlphabetical {
    public String[] sortWordsInParagraph(String paragraph){
        if(paragraph==null){
            return null;
        }
        String[] required=paragraph.split("[\\s,]+");
        Arrays.sort(required);
        return required;
    }
}
