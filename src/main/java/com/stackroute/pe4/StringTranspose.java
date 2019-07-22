package com.stackroute.pe4;

public class StringTranspose {
    public  String transpose(String str) {
            if(str==null){
                return null;
            }
            StringBuffer output=new StringBuffer("");

            for(String string:str.split(" ")){
                StringBuffer value=new StringBuffer(string);
                value.reverse();
                output.append(value).append(" ");
            }

            return output.substring(0,output.length()-1);

        }
}
