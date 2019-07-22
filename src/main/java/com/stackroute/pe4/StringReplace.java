package com.stackroute.pe4;

public class StringReplace {
        public String replaceWord(String replaceString){
            if(replaceString==null){
                return null;
            }
            String result=replaceString.replaceAll("d","f");
            return result.replaceAll("l","t");
        }

}

