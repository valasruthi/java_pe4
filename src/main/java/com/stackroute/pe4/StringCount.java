package com.stackroute.pe4;

public class StringCount {
    public int charData(char charinput){
        int result;
        String str="The given program returns the count of the occurance character in a String";
        result=str.length();
        result=str.replace("a", "").length();
        int charcount = str.length() - str.replaceAll("a", "").length();

        return charcount ;
    }

}
