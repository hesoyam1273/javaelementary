package com.company;

import java.lang.*;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpFinder {
    private void  rxp(String regexp, String fileIn, String fileOut) throws Exception{
        try {

            //создаем объект FileReader для объекта File
            BufferedReader br = new BufferedReader(new FileReader(fileIn));

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut,true));
            String line;
            Pattern pat = Pattern.compile(regexp);



            while ((line=br.readLine())!=null){
                Matcher matcher = pat.matcher(line);
                if(matcher.find()){
                    //System.out.println(line);
                    bw.write(new String(line.getBytes(), "UTF-8"));
                    bw.write("\n");
                }

            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {e.printStackTrace();}



    }

    public static void main(String[] args) throws Exception {
        RegexpFinder rf = new RegexpFinder();
        String regexp = args[0];
        String fileIn = args[1];
        String fileOut = args[2];
        //String regexp = ".*(WARN).*";
        //String fileIn = "/Users/macbook/Documents/java/main.log0";
        //String fileOut = "/Users/macbook/Documents/java/logreg";

        rf.rxp(regexp,fileIn,fileOut);

    }
}
