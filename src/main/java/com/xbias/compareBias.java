package com.xbias;
import java.io.FileWriter;
import java.io.BufferedWriter;

class compareBias {
    /**uses machine learning to find bias in news articles. 
    * @param parsedFile the file parsed through Scraper.java
    * @return report on certainty of bias with reasoning.
    * @throws Exception
    */
    public void input(String parsedFile, String FileName) throws Exception
    {          
        FileWriter fw = new FileWriter(FileName, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(parsedFile);
        bw.newLine();
        bw.close();
    }
}