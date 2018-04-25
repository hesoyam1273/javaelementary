package com.company;
import java.lang.*;
import java.io.*;


public class SplitLine {
    private void split(String sym, String fileIn, String fileOut) throws  Exception{
        try {

            //создаем объект FileReader для объекта File
            BufferedReader br = new BufferedReader(new FileReader(fileIn));

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut,true));

            String line = br.readLine();
            while ((line)!=null){

                String[] partLine;
                partLine=line.split("\\s{0,100}:\\s");


                String replacePartLine = partLine[0].replaceAll("[\\s+^\\n]", sym);
                bw.write(replacePartLine);

                bw.write(";"+partLine[1]);
                bw.write("\n");
                line = br.readLine();

            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {e.printStackTrace();}
    }

    public static void main(String[] args) throws Exception{
	    SplitLine sl = new SplitLine();
	    String sym = args[0];
	    String fileIn = args[1];
	    String fileOut = args[2];
	    sl.split(sym,fileIn,fileOut);
    }
}
